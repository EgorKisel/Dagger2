package com.example.dagger2

import android.os.Bundle
import com.example.dagger2.di.AppComponent
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {

    @Inject lateinit var deps: Deps

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppComponent.create(applicationContext).inject(this)
        deps
        viewModel.test()
    }
}

data class Deps(
    val name: String
)