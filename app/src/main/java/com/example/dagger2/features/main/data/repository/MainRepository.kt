package com.example.dagger2.features.main.data.repository

import com.example.dagger2.features.main.data.model.MainResponse
import retrofit2.Retrofit
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val retrofit: Retrofit,
) {

    fun loadMainResponse(): MainResponse {
        return MainResponse("Title $retrofit")
    }
}