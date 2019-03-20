package com.elhazent.picodiploma.kotlinjadwalsholat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.elhazent.picodiploma.kotlinjadwalsholat.modul.ItemsItem
import com.elhazent.picodiploma.kotlinjadwalsholat.modul.ResponseItem
import com.elhazent.picodiploma.kotlinjadwalsholat.network.ApiClient
import com.elhazent.picodiploma.kotlinjadwalsholat.network.ApiService
import com.elhazent.picodiploma.kotlinjadwalsholat.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Response


class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setTitle("Jadwal Sholat")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val kota = intent.getStringExtra("kota")
        actionLoad(kota)
        fab.setOnClickListener {
            actionLoad(kota)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id: Int = item!!.itemId
        if (id == android.R.id.home) {
            finish()
        }

        return super.onOptionsItemSelected(item)
    }

    fun actionLoad(periode: String) {
        val api: ApiService = ApiClient.getInstance
        api.jadwal(periode).enqueue(object : retrofit2.Callback<ResponseItem> {
            override fun onFailure(call: Call<ResponseItem>, t: Throwable) {

            }

            override fun onResponse(call: Call<ResponseItem>, response: Response<ResponseItem>) {
                if (response.isSuccessful) {

                    val dataList = response.body()?.items!!.get(0)

                    lokasi_value.setText(response.body()!!.query +", " + response.body()?.countryCode)
                    tanggal_value.setText(dataList!!.dateFor)
                    fajrvalue?.setText(dataList!!.fajr)
                    shoroq_value?.setText(dataList!!.shurooq)
                    dhuhur_value?.setText(dataList!!.dhuhr)
                    ashar_value?.setText(dataList!!.asr)
                    maghrib_value?.setText(dataList!!.maghrib)
                    isya_value?.setText(dataList!!.isha)
                }
            }

        })
    }
}
