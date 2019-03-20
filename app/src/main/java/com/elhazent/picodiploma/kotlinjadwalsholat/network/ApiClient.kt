package com.elhazent.picodiploma.kotlinjadwalsholat.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    val BASE_URL = "http://muslimsalat.com"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val getInstance:ApiService
        get() = retrofit.create(ApiService::class.java)
}