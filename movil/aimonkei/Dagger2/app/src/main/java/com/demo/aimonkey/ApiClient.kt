package com.demo.aimonkey

import retrofit2.http.GET

interface ApiClient {

    @GET("/aimonkey/inicio")
    suspend fun getData() : DataModel
}