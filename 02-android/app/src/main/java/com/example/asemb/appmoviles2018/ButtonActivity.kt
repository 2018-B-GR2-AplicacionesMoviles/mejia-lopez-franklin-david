package com.example.asemb.appmoviles2018

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {

    var nombre:String=""
    var apellido:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_button)
        this.capturarDatosDelIntent()
        act_but_nombre_apellido.text="${this.nombre}${this.apellido}"


    }

    fun capturarDatosDelIntent(){
        this.nombre=intent.getStringExtra("ombre")
        this.apellido=intent.getStringExtra("apellido")
    }
}
