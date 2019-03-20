package com.elhazent.picodiploma.kotlinjadwalsholat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_submit.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.putExtra("kota", edt_login_loc.text.toString())
            val kota:String = edt_login_loc.text.toString()

            if (!TextUtils.isEmpty(kota)){
                startActivity(intent)
            } else {
                toast("Nama kota tidak boleh kosong")

            }

        }
    }
}
