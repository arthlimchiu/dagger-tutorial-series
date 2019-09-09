package com.arthlimchiu.daggerworkshop.dagger

import com.arthlimchiu.daggerworkshop.userdetails.UserDetailsActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(activity: UserDetailsActivity)
}