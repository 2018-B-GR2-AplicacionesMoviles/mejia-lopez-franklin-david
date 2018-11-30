package com.example.asemb.componentes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt= findViewById(R.id.mensaje) as TextView
        txt.setText("Si funciona!!!")

        b_Inicio.setOnClickListener{

            b_Inicio.setOnClickListener {  this.irAPantallaPrimer()}
        }




    }
    fun irAPantallaPrimer(){
        val intentIrAPrimer =Intent(this,Primer::class.java  )
        this.startActivity(intentIrAPrimer)
    }


    }

