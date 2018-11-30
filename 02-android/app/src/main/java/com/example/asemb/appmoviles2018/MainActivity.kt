    package com.example.asemb.appmoviles2018

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton_navegar.setOnClickListener {
            //Log.i("navegacion","hola")//

                        //INTENT
            boton_navegar.setOnClickListener { this.irAPantallaDeBotones() }
        }

    }
    fun irAPantallaDeBotones(){
        //INTENT
        val intentIrABotones=Intent(this,ButtonActivity::class.java)
        intentIrABotones.putExtra("nombre","Adrian")
        intentIrABotones.putExtra("apellido", "Eguez")
        this.startActivity(intentIrABotones)
    }
}
