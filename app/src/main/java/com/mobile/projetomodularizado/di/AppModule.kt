package com.mobile.projetomodularizado.di

import com.mobile.feature.contato.di.ContactModule
import org.koin.core.module.Module

object AppModule {
    fun getModules(): List<Module> = listOf(
        uiModule,
        dataModule,
        useCaseModule,
        *ContactModule.getModules()
    )
}