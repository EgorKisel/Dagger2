package com.example.dagger2.di

import android.content.Context
import com.example.dagger2.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Qualifier

@Component(modules = [MainModule::class])
interface AppComponent {

    companion object {
        fun create(
            context: Context,
            appId: String,
            apiKey: String,
        ): AppComponent {
            return DaggerAppComponent
                //Первый способ передачи контекста через фабрику
                .factory().create(context, appId, apiKey)

            // второй способ
//                .builder()
//                .context(context)
//                .build()
        }
    }
    //Второй способ передачи контекста через билдер
//    @Component.Builder
//    interface Builder{
//        @BindsInstance
//        fun context(context: Context): Builder
//        fun build(): AppComponent
//    }

    //Первый способ передачи контекста через фабрику
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance @AppId appId: String,
            @BindsInstance @ApiKey apiKey: String,
        ): AppComponent
    }

    fun inject(mainActivity: MainActivity)
}

@Qualifier
annotation class ApiKey

@Qualifier
annotation class AppId