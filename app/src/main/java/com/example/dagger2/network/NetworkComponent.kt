package com.example.dagger2.network

import com.example.dagger2.core.NetworkProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkComponent : NetworkProvider {

    companion object {
        fun create(): NetworkComponent {
            return DaggerNetworkComponent.factory().create()
        }
    }

    @Component.Factory
    interface Factory {
        fun create(): NetworkComponent
    }
}