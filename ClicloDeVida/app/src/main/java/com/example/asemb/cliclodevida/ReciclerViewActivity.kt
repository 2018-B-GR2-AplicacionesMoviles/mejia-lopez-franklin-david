package com.example.asemb.cliclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_recicler_view.*
import java.text.FieldPosition

class ReciclerViewActivity : AppCompatActivity() {


    var personas=ArrayList<Persona>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recicler_view)

        crearDatos()

        val layoutManager=LinearLayoutManager(this  )

        val adaptador=PersonasAdaptador(personas)


        rvListaPro.layoutManager=layoutManager
        rvListaPro.itemAnimator=DefaultItemAnimator()
        rvListaPro.adapter=adaptador
        adaptador.notifyDataSetChanged()

        Log.i("Vista Principal","CambioPersonas ${personas.size}")


    }

    fun crearDatos(){


        personas.add(Persona("David","1716850156"))
        personas.add(Persona("Luis","0016850156"))
        personas.add(Persona("Pedro","4006850156"))
    }
}


class Persona(var nombre:String,var cedula:String){


}

class PersonasAdaptador(private val listaPersonas: List<Persona>):
    RecyclerView.Adapter<PersonasAdaptador.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).
            inflate(R.layout.lista_recycler_view_layout,parent,false)


        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
    return listaPersonas.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val persona=listaPersonas[position]
        holder.nombreTextView.setText(persona.nombre)
        holder.cedulaTextView.setText(persona.cedula)

    }

    inner class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        var nombreTextView:TextView
        var cedulaTextView:TextView
        init {
            nombreTextView=view.findViewById(R.id.textViewNombre) as TextView
            cedulaTextView=view.findViewById(R.id.textViewCedula) as TextView

            val layout=view.findViewById(R.id.rlPrincipal)as RelativeLayout

            layout.setOnClickListener{
                val nombreActual=it.findViewById(R.id.textViewNombre) as TextView
                Log.i("Recyvler","El nombre actual es: ${nombreActual.text}")

            /*layout.setOnClickListener({v->
                val nombreActual=v.findViewById(R.id.textViewNombre) as TextView
                Log.i("Recyvler","El nombre actual es: ${nombreActual.text}")
            })*/


        }
    }



}

}