package com.mobile.feature.contato.di

import org.koin.core.module.Module

object ContactModule {
    fun getModules(): Array<Module> = arrayOf(
        uiModule,
        dataModule,
        useCaseModule
    )
}