package com.mobile.lib.network

interface MapTo<T> {
    fun mapTo(): T
}

fun <T> Iterable<MapTo<T>>.mapTo() = this.map { it.mapTo() }