package com.mobile.lib.network

import retrofit2.Response

object RequestManager {
    suspend fun <T> requestFromApi(
        request:(suspend () -> Response<T>)
    ): T? {
        try {
            val response = request()
            if(response.isSuccessful) {
                return response.body()
            }
            else {
                val message = response.message()
                throw when(response.code()) {
                    400,422 -> ServerErrorException(message)
                    500 -> ServerErrorException(message)
                    else -> GeneralNetworkException(message)
                }
            }

        } catch (e: Exception) {
            // Log
            throw e
        }
    }
}