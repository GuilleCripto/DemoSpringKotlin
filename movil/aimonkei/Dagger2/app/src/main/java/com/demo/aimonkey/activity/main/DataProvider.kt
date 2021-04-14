package com.demo.aimonkey.activity.main

object DataProvider {
    fun doHeaviTask():Int{
        Thread.sleep(200)
        return 100
    }
}