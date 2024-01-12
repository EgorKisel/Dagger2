package com.example.dagger2.core

import retrofit2.Retrofit

interface NetworkProvider {

    fun provideRetrofit(): Retrofit
}