package com.example.dagger2.core.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
interface ViewModelsModule {

    @Binds
    fun bindViewModelFactory(viewModelsFactory: ViewModelsFactory): ViewModelProvider.Factory
}