package com.mobile.lib.network

import java.lang.Exception

open class ServerErrorException(message: String?, cause: Throwable? = null) : Exception(message ?: cause?.message, cause)