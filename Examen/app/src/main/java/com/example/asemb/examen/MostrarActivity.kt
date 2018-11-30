package com.example.asemb.examen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_mostrar.*

class MostrarActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)
        mostrar()
    }

    fun mostrar(){

        val listView = findViewById<ListView>(R.id.ListaProductos)
// 1
        val recipeList = RegistrarActivity.BaseDeDatos.Producto
// 2
        val listItems = arrayOfNulls<String>(recipeList.size)
// 3
        for (i in 0 until recipeList.size) {
            val recipe = recipeList[i]
            listItems[i] = recipe
        }
// 4
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter = adapter

    }

}
