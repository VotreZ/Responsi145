package com.example.responsi145

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_akun.*
import kotlinx.android.synthetic.main.activity_register.*

class Akun : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        val bundle:Bundle? = intent.extras

        val em = bundle?.get("Email")
        val nama = bundle?.get("Nama")
        val us = bundle?.get("Username")

        outNama.text = ("Nama : " +nama)
        outEmail.text = ("Email : " +em)
        outUser.text = ("Username : " +us)
    }
}
