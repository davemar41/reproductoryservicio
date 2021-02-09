package com.example.reproductoryservicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intentservicio=Intent(this,Miservicio::class.java)
        play.isEnabled=false
        pausa.isEnabled=false
        stop.isEnabled=false
        bloquear.isEnabled=false
        volver.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        resultado.setOnClickListener {
            var minumero:Double=numero1text.text.toString().toDouble()
            var minumero2:Double=numero2text.text.toString().toDouble()
            var miresultado:Double=minumero+minumero2
            textoresultado.setText(miresultado.toString())

        }
        iniciar.setOnClickListener {
            play.isEnabled=true
            pausa.isEnabled=true
            stop.isEnabled=true
            bloquear.isEnabled=true
        }
        play.setOnClickListener {
            intentservicio.putExtra(Konstantes.Dato,0)
            startService(intentservicio)
        }
        pausa.setOnClickListener {
                intentservicio.putExtra(Konstantes.Dato,1)
            startService(intentservicio)

        }
        stop.setOnClickListener {
            intentservicio.putExtra(Konstantes.Dato,2)
            startService(intentservicio)
        }
        bloquear.setOnClickListener {
            intentservicio.putExtra(Konstantes.Dato,3)
            startService(intentservicio)
        }
        parar.setOnClickListener {
            play.isEnabled=false
            pausa.isEnabled=false
            stop.isEnabled=false
            bloquear.isEnabled=true

        }
    }
}