package com.example.dagger2.features.main.presentation

import androidx.lifecycle.ViewModel
import com.example.dagger2.features.main.data.repository.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: MainRepository,
) : ViewModel() {
}