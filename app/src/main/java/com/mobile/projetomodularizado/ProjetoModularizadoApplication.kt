package com.mobile.projetomodularizado

import android.app.Application
import com.mobile.projetomodularizado.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ProjetoModularizadoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        configureKoin()
        configureTimber()
    }

    private fun configureKoin() {
        startKoin {
            androidContext(this@ProjetoModularizadoApplication)
            modules(
                AppModule.getModules()
            )
        }
    }

    private fun configureTimber() {
    }
}