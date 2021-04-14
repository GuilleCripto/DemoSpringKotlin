package com.demo.aimonkey.activity.main

import com.demo.aimonkey.SingleDataModel

sealed class MainActivityViewState {
    object ShowLoading : MainActivityViewState()
    class ShowError(val error: Throwable) : MainActivityViewState()
    class ShowData(val data: List<SingleDataModel>) : MainActivityViewState()
}