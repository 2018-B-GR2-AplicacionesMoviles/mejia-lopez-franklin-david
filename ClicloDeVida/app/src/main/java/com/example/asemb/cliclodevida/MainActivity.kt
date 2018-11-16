package com.example.asemb.cliclodevida

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cliclo_vida.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_CicloDeVida.setOnClickListener{
            this.irACicloDeVida()
        }

    }

    fun irACicloDeVida(){
        val irACV=Intent(this,ClicloVidaActivity::class.java)
        this.startActivity(irACV)

    }



}
