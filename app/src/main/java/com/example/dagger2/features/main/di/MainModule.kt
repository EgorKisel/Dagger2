package com.example.dagger2.features.main.di

import androidx.lifecycle.ViewModel
import com.example.dagger2.core.di.ViewModelKey
import com.example.dagger2.features.main.presentation.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindViewModel(mainViewModel: MainViewModel): ViewModel
}