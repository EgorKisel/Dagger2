package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel

open class BaseActivity<T : ViewModel> : AppCompatActivity() {
    lateinit var viewModel: T
}