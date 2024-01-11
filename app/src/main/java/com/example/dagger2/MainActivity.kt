package com.example.dagger2

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.example.dagger2.di.ApiKey
import com.example.dagger2.di.AppComponent
import com.example.dagger2.di.AppId
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {

    @Inject
    lateinit var deps: Deps

    @Inject
    lateinit var secondViewModelFactory: SecondViewModel.Factory

    @Inject @ApiKey lateinit var apiKey: String
    @Inject @AppId lateinit var appId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppComponent.create(applicationContext, "appId", "apiKey").inject(this)
        deps
        viewModel.test()

        (applicationContext as MainApp).appComponent.inject(this)

        val viewModel2 = secondViewModelFactory.create("123")
    }
}

data class Deps(
    val name: String,
)