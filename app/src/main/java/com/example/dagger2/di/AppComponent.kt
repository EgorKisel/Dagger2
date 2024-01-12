package com.example.dagger2.di

import android.content.Context
import com.example.dagger2.core.DependenciesProvider
import com.example.dagger2.MainActivity
import com.example.dagger2.core.NetworkProvider
import com.example.dagger2.network.NetworkComponent
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [MainModule::class],
    dependencies = [NetworkProvider::class]
)
interface AppComponent : DependenciesProvider {

    companion object {
        fun create(
            context: Context,
        ): AppComponent {
            val networkProvider = NetworkComponent.create()
            return DaggerAppComponent
                .factory().create(context, networkProvider)
        }
    }

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
            networkProvider: NetworkProvider,
        ): AppComponent
    }

    fun inject(mainActivity: MainActivity)
}