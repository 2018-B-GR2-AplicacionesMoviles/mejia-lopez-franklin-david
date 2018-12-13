package com.example.asemb.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registrar.*


class RegistrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        botonActualizar.setOnClickListener { actualizar() }
        botonBorrar.setOnClickListener { borrar() }
        botonCancelar.setOnClickListener { cancelar() }




    }
    fun cancelar(){
        val myIntent = Intent(this, MainActivity::class.java)
        this.startActivity(myIntent)
    }
    fun borrar(){
        BaseDeDatos.eliminarDatos(NombreProducto.text.toString())
        BaseDeDatos.eliminarDatos(CantidadProducto.text.toString())
        BaseDeDatos.eliminarDatos(PrecioProducto.text.toString())
        BaseDeDatos.eliminarDatos(DetalleProducto.text.toString())

    }
    fun actualizar(){
        BaseDeDatos.agregarDatos(NombreProducto.text.toString())
        BaseDeDatos.agregarDatos(CantidadProducto.text.toString())
        BaseDeDatos.agregarDatos(PrecioProducto.text.toString())
        BaseDeDatos.agregarDatos(DetalleProducto.text.toString())

    }

    class BaseDeDatos{
        companion object {
            val Producto:ArrayList<String> = ArrayList()
            fun agregarDatos(producto:String){
                Producto.add(producto)
            }
            fun eliminarDatos(producto:String){
                Producto.clear()

            }
        }

    }
}
