package com.mobile.feature.contato.data.schemas

import com.google.gson.annotations.SerializedName
import com.mobile.feature.contato.model.Contato
import com.mobile.lib.network.MapTo

internal data class ContatoSchema(
    @SerializedName("nome")
    val nome:String,
    @SerializedName("email")
    val email:String

): MapTo<Contato> {
    override fun mapTo() = Contato(
        nome= nome,
        email = email
    )
}
