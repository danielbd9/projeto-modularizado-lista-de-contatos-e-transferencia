package com.mobile.feature.contato.data

import com.mobile.feature.contato.model.Contato


internal interface ContatoRepository {
    suspend fun buscarContato(id: Int) : Contato
}
