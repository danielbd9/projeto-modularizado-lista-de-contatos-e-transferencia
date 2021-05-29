package com.mobile.feature.contato.di

import org.koin.core.module.Module

object ContatoModule {
    fun getModules(): Array<Module> = arrayOf(
        uiModule,
        dataModule,
        useCaseModule
    )
}