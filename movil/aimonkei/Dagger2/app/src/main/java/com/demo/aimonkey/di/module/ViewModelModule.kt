package com.soumyajit.daggermultibindingmvvmsample.di.module

import androidx.lifecycle.ViewModel
import com.demo.aimonkey.activity.main.MainActivityViewModel
import com.demo.aimonkey.di.annotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainViewModel(mainActivityViewModel: MainActivityViewModel) : ViewModel
}