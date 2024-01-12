package com.example.dagger2.features.main.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2.R
import com.example.dagger2.core.App
import com.example.dagger2.features.main.di.MainComponent
import javax.inject.Inject

class MainFragment : Fragment(R.layout.fragment_main) {
    @Inject
    lateinit var viewModelsFactory: ViewModelProvider.Factory

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dependenciesProvider =
            (requireActivity().applicationContext as App).getDependencyProvider()
        MainComponent.create(dependenciesProvider).inject(this)
        val viewModel =
            ViewModelProvider(this, viewModelsFactory)[MainViewModel::class.java]
    }
}