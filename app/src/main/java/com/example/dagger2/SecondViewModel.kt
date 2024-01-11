package com.example.dagger2

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class SecondViewModel @AssistedInject constructor(
    @Assisted val id: String,
    val repoImpl: RepoImpl,
) {
    @AssistedFactory
    interface Factory {
        fun create(id: String): SecondViewModel
    }
}