package com.demo.aimonkey

import com.demo.aimonkey.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DaggerMVVMMultiBindingApplication : DaggerApplication() {


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).baseUrl("http://192.168.137.1:8090/").build()

    }

}