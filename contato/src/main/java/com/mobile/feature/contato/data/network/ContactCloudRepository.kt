package com.mobile.feature.contato.data.network

import com.mobile.feature.contato.data.ContactRepository
import com.mobile.feature.contato.model.Contact
import com.mobile.lib.network.GeneralNetworkException
import com.mobile.lib.network.RequestManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


internal class ContactCloudRepository(private val api: ContactApi): ContactRepository {
    override suspend fun buscarContato(id: Int): Contact {
        return withContext(Dispatchers.IO) {
            val apiResponse = RequestManager.requestFromApi { api.buscarContato(id) }?.mapTo()
            apiResponse?.let { it } ?: throw GeneralNetworkException(message = "Dados não encontratos.")
        }
    }
}
