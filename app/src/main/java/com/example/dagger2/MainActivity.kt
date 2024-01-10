package com.example.dagger2

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.example.dagger2.di.AppComponent
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {

    @Inject
    lateinit var deps: Deps
    @Inject
    lateinit var secondViewModelFactory: SecondViewModel.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppComponent.create(applicationContext).inject(this)
        deps
        viewModel.test()

        val viewModel2 = secondViewModelFactory.create("123")
    }
}

class SecondViewModel @AssistedInject constructor(
    @Assisted val id: String,
    val repoImpl: RepoImpl,
) {
    @AssistedFactory
    interface Factory {
        fun create(id: String): SecondViewModel
    }
}

class RepoImpl @Inject constructor()

data class Deps(
    val name: String,
)