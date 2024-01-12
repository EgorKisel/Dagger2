package com.example.dagger2.features.main.di

import com.example.dagger2.core.DependenciesProvider
import com.example.dagger2.core.di.ViewModelsModule
import com.example.dagger2.features.main.presentation.MainFragment
import dagger.Component

@Component(
    dependencies = [DependenciesProvider::class],
    modules = [
        ViewModelsModule::class,
        MainModule::class
    ]
)
interface MainComponent {

    companion object {
        fun create(dependenciesProvider: DependenciesProvider): MainComponent {
            return DaggerMainComponent.factory().create(dependenciesProvider)
        }
    }

    @Component.Factory
    interface Factory {
        fun create(
            dependenciesProvider: DependenciesProvider,
        ): MainComponent
    }

    fun inject(mainFragment: MainFragment)
}