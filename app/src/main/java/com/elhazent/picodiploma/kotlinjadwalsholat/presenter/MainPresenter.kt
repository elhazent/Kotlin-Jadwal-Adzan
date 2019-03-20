package com.elhazent.picodiploma.kotlinjadwalsholat.presenter

import android.view.View
import com.elhazent.picodiploma.kotlinjadwalsholat.MainActivity
import com.elhazent.picodiploma.kotlinjadwalsholat.MainView
import com.elhazent.picodiploma.kotlinjadwalsholat.modul.ItemsItem
import com.elhazent.picodiploma.kotlinjadwalsholat.modul.ResponseItem
import com.elhazent.picodiploma.kotlinjadwalsholat.network.ApiClient
import com.elhazent.picodiploma.kotlinjadwalsholat.network.ApiService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import retrofit2.Call
import retrofit2.Response

class MainPresenter (private val view: MainView){

//    var mainActivity:MainActivity?= null
//        fun actionLoad(kota:String){
//            mainActivity= MainActivity()
//        val api:ApiService = ApiClient.getInstance
//        api.jadwal(kota).enqueue(object : retrofit2.Callback<ResponseItem>{
//            override fun onFailure(call: Call<ResponseItem>, t: Throwable) {
//                view.errorMessage(t.localizedMessage.toString())
//            }
//
//            override fun onResponse(call: Call<ResponseItem>, response: Response<ResponseItem>) {
//
//                val dataList = response.body()?.items!!.get(0)
//                mainActivity!!.lokasi_value.setText(response.body()!!.query+", "+ response.body()?.items!!.get(0)!!.dateFor);
////                    lokasi_value?.setText(response.body()?.city + ", " + dataList!!.dateFor)
//                mainActivity!!.fajrvalue?.setText(dataList!!.fajr)
//                mainActivity!!.shoroq_value?.setText(dataList!!.shurooq)
//                mainActivity!!.dhuhur_value?.setText(dataList!!.dhuhr)
//                mainActivity!!.ashar_value?.setText(dataList!!.asr)
//                mainActivity!!.maghrib_value?.setText(dataList!!.maghrib)
//                mainActivity!!.isya_value?.setText(dataList!!.isha)
//            }
//
//        })
//    }
}