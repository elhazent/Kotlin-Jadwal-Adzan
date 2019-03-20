package com.elhazent.picodiploma.kotlinjadwalsholat

import com.elhazent.picodiploma.kotlinjadwalsholat.modul.ItemsItem

interface MainView {
    fun showMessage(isipesan:String)
    fun showListItem(listItem: List<ItemsItem?>)
    fun errorMessage(pesanError:String)
}