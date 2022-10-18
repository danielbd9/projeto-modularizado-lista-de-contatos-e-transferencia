package com.mobile.feature.contato.data

import com.mobile.feature.contato.model.Contact


internal interface ContactRepository {
    suspend fun buscarContato(id: Int) : Contact
}
