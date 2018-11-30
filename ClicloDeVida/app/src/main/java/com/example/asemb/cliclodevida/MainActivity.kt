package com.example.asemb.cliclodevida

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_cliclo_vida.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arregloUsuarios=ArrayList<User>();

        val usuarioUno=User("David",29, Date(1986,6,10),12.00)
        val usuarioDos=User("Evelyn",29, Date(1986,6,10),12.00)

        arregloUsuarios.add(usuarioUno)
        arregloUsuarios.add(usuarioDos)

        var listView = findViewById<ListView>(R.id.recipe_list_view)



        val listItems = arrayOfNulls<String>(arregloUsuarios.size)

        for (i in 0 until arregloUsuarios.size) {
            val recipe = arregloUsuarios[i]
            listItems[i] = recipe.nomnbre
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter = adapter

        val adaptadorUsuarios= ArrayAdapter<User>(this,
            android.R.layout.simple_spinner_item,
            arregloUsuarios)

        spinner_usuarios.adapter=adaptadorUsuarios;


        b_CicloDeVida.setOnClickListener{
            this.irACicloDeVida()
        }

        b_Parce_Act.setOnClickListener {
            this.irActividadParcelableIntent()
        }



    }

    fun irACicloDeVida(){
        val irACV=Intent(this,ClicloVidaActivity::class.java)
        this.startActivity(irACV)

    }

    fun irActividadParcelableIntent(){
        val intentActividadIntent=Intent(
            this,ParcelableActivity::class.java

        )
        val david=User("David",29, Date(1986,6,10),12.00)
        val kaiser=Mascota("Kaiser",4, Date(1986,6,10),"Golden")

        intentActividadIntent.putExtra("user",david)
        intentActividadIntent.putExtra("mascota",kaiser)


        startActivity(intentActividadIntent)
    }


}
