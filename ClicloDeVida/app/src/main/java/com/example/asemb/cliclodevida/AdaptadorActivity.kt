package com.example.asemb.cliclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class AdaptadorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adaptador)

        val arregloUsuarios=ArrayList<User>();

        val usuarioUno=User("David",29, Date(1986,6,10),12.00)
        val usuarioDos=User("Evelyn",29, Date(1986,6,10),12.00)

        arregloUsuarios.add(usuarioUno)
        arregloUsuarios.add(usuarioDos)

        //ADAPTADOR


        val adaptadorUsuarios=ArrayAdapter<User>(this,
            android.R.layout.simple_spinner_item,
            arregloUsuarios)

        spinner_usuarios.adapter=adaptadorUsuarios;

    }
}
