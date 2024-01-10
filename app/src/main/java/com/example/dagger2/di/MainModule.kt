package com.example.dagger2.di

import com.example.dagger2.Deps
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
object MainModule {

    @Provides
    fun provideDeps(): Deps = Deps("NAme")

}