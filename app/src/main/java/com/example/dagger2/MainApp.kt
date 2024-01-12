package com.example.dagger2

import android.app.Application
import com.example.dagger2.core.App
import com.example.dagger2.core.DependenciesProvider
import com.example.dagger2.di.AppComponent

class MainApp : Application(), App {

    private val appComponent by lazy { AppComponent.create(applicationContext) }

    override fun getDependencyProvider(): DependenciesProvider {
        return appComponent
    }
}