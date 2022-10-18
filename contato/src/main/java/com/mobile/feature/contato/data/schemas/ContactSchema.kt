package com.mobile.feature.contato.data.schemas

import com.google.gson.annotations.SerializedName
import com.mobile.feature.contato.model.Contact
import com.mobile.lib.network.MapTo

internal data class ContactSchema(
    @SerializedName("nome")
    val nome:String,
    @SerializedName("email")
    val email:String

): MapTo<Contact> {
    override fun mapTo() = Contact(
        nome= nome,
        email = email
    )
}
