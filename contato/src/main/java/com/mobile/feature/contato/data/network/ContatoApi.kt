package com.mobile.feature.contato.data.network

import com.mobile.feature.contato.data.schemas.ContatoSchema
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

internal interface ContatoApi {
    @GET("/api/Cliente/{id}")
    suspend fun buscarContato(@Path("id") id: Int) : Response<ContatoSchema>
}
