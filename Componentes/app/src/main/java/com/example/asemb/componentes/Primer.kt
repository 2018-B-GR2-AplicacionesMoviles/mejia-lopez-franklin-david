package com.example.asemb.componentes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_primer.*

class Primer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer)


        s_Segunda.setOnClickListener{

            b_Inicio.setOnClickListener {  this.irAPantallaPrimer()}
        }




    }
    fun irAPantallaPrimer(){
        val intentIrAPrimer = Intent(this,Primer::class.java  )
        this.startActivity(intentIrAPrimer)
    }


}
