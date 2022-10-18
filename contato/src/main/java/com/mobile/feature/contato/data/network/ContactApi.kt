package com.mobile.feature.contato.data.network

import com.mobile.feature.contato.data.schemas.ContactSchema
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

internal interface ContactApi {
    @GET("/api/Cliente/{id}")
    suspend fun buscarContato(@Path("id") id: Int) : Response<ContactSchema>
}
