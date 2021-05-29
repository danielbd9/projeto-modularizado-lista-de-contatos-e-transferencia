package com.mobile.libs.utils.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.libs.utils.extensions.SingleLiveEvent
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    val showError = SingleLiveEvent<String>()
    val state = SingleLiveEvent<State>()
    val isLoading =
        SingleLiveEvent<Boolean>()

    enum class State {
        Default,
        Loading
    }

    fun doAsync(work: suspend () -> Unit) {
        viewModelScope.launch {
            try {
                state.call(State.Loading)
                isLoading.call(true)
                work()
            } catch (e: Exception) {
                showError.call(e.message)
            }
            state.call(State.Default)
            isLoading.call(false)
        }
    }
}