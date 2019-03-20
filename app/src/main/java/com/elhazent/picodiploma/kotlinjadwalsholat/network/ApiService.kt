package com.elhazent.picodiploma.kotlinjadwalsholat.network

import com.elhazent.picodiploma.kotlinjadwalsholat.modul.ResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {


    @GET("{query}/daily.json")
    fun jadwal(@Path("query") periode: String): Call<ResponseItem>
}