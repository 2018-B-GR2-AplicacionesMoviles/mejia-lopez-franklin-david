package com.example.asemb.cliclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ParcelableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)


        val usuario=intent.getParcelableExtra<User?>("user")
        val mascota=intent.getParcelableExtra<Mascota?>("mascota")

        Log.i("parcelable","Usuario ${usuario!!.nomnbre} y mascota ${mascota!!.nomnbre} ")
    }
}
 //Proceso 1 -> val nombre="Adrian"
    //Proceso de serializar
 //Proceso 2-> val apellido"Equez"