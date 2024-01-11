package com.example.dagger2

import android.app.Application
import com.example.dagger2.di.AppComponent

class MainApp : Application() {
    val appComponent by lazy { AppComponent.create(applicationContext, "", "") }
}