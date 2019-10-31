package com.example.responsi145

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        submit.setOnClickListener{
            var nama: EditText = findViewById(R.id.nama)
            var user: EditText = findViewById(R.id.username)
            var email: EditText = findViewById(R.id.email)

            val intent = Intent (this, Akun::class.java)

            Toast.makeText(this, "Sukses", Toast.LENGTH_SHORT).show()
            intent.putExtra("Nama", nama.getText())
            intent.putExtra("Email", email.getText())
            intent.putExtra("Username", user.getText())
            startActivity(intent)
        }


    }
}
