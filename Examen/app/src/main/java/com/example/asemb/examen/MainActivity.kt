package com.example.asemb.examen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonmostrar.setOnClickListener { irAMostrar()}
        botonregistrar.setOnClickListener { irARegistrar() }
    }

    fun irAMostrar(){
        val myIntent = Intent(this, MostrarActivity::class.java)
        this.startActivity(myIntent)

    }
    fun irARegistrar(){
        val myIntent = Intent(this, RegistrarActivity::class.java)
        this.startActivity(myIntent)

    }
}
