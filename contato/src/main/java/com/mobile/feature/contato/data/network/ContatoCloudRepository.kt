package com.mobile.feature.contato.data.network

import com.mobile.feature.contato.data.ContatoRepository
import com.mobile.feature.contato.model.Contato
import com.mobile.lib.network.GeneralNetworkException
import com.mobile.lib.network.RequestManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


internal class ContatoCloudRepository(private val api: ContatoApi): ContatoRepository {
    override suspend fun buscarContato(id: Int): Contato {
        return withContext(Dispatchers.IO) {
            val apiResponse = RequestManager.requestFromApi { api.buscarContato(id) }?.mapTo()
            apiResponse?.let { it } ?: throw GeneralNetworkException(message = "Dados não encontratos.")
        }
    }
}
