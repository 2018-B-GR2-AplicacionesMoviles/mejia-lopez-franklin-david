package com.example.asemb.cliclodevida

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cliclo_vida.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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
