package com.mobile.libs.utils.base


interface UseCase<Param, Return> {
    suspend fun execute(param:Param) : Return
}