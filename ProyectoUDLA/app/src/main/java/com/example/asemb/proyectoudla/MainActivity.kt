package com.example.asemb.proyectoudla

import android.animation.Animator
import android.animation.ValueAnimator
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.view.KeyEvent
import android.view.animation.BounceInterpolator
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    internal var lsvLista:ListView?=null


    internal var nombre:Array<String>?=null
    internal var edad:Array<String>?=null
    internal var sexo:Array<String>?=null


    private var name:String?=null
    private var age:String?=null
    private var genero:String?=null


    private val num=10
    private val count=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lsvLista=findViewById<ListView>(R.id.lista)

        nombre= Array<String>(num,{""})
        edad= Array<String>(num,{""})
        sexo= Array<String>(num,{""})

        operacion()

    }

    fun operacion(){
         val nombres:Array<String>
        for (i in 0..num){
            nombre?.set(i,name as String)
            edad?.set(i,age as String)
            sexo?.set(i,genero as String)

        }

    }

}


