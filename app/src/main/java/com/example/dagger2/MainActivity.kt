package com.example.dagger2

import android.os.Bundle
import com.example.dagger2.core.baseapp.BaseActivity
import com.example.dagger2.features.main.presentation.MainFragment

class MainActivity : BaseActivity<MainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MainFragment()).commit()
        }
    }
}