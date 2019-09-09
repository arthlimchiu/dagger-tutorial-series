package com.arthlimchiu.daggerworkshop

import android.app.Application
import com.arthlimchiu.daggerworkshop.dagger.AppComponent
import com.arthlimchiu.daggerworkshop.dagger.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent
            .create()
    }
}

lateinit var component: AppComponent