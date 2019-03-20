package com.elhazent.picodiploma.kotlinjadwalsholat.modul

import com.google.gson.annotations.SerializedName

data class TodayWeather(

	@field:SerializedName("temperature")
	val temperature: String? = null,

	@field:SerializedName("pressure")
	val pressure: String? = null
)