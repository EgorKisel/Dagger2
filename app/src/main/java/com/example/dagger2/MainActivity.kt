package com.example.dagger2

import android.os.Bundle
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {

    @Inject lateinit var deps: Deps
    @Inject lateinit var repo: IRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppComponent.create().inject(this)
        deps
        viewModel.test()
    }
}

data class Deps(
    val name: String
)