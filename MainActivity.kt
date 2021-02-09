package com.example.reproductoryservicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dale.setOnClickListener {
            Toast.makeText(this,"vamos a la pagina principal",Toast.LENGTH_LONG).show()
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}