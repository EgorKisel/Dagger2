package com.example.dagger2

import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Component(modules = [MainModule::class])
interface AppComponent {

    companion object {
        fun create(): AppComponent {
            return DaggerAppComponent.create()
        }
    }

    fun inject(mainActivity: MainActivity)
}

@Module(includes = [MainModule.Inner::class])
object MainModule {

    @Provides
    fun provideDeps(): Deps = Deps("NAme")

    @Module
    interface Inner {
        @Binds
        fun bindRepoImpl(repoImpl: RepoImpl): IRepo
    }
}

interface IRepo

class RepoImpl @Inject constructor(
    val deps: Deps,
) : IRepo