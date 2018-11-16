package com.example.asemb.cliclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_cliclo_vida.*

class ClicloVidaActivity : AppCompatActivity() {
    var contador=0
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ciclo-vida","On Create")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cliclo_vida)


        c_Contador.setOnClickListener{

            this.aumentarContador()

        }
    }

    fun aumentarContador(){
        contador=contador+1
        text_Contador.text=contador.toString()
    }

    override fun onStart(){
        super.onStart()
        Log.i("ciclo-vida","On Start")

    }
    override  fun onResume(){
        super.onResume()
        Log.i("ciclo-vida","On Resume")

    }
    override  fun onPause(){
        super.onPause()
        Log.i("ciclo-vida","On Pause")

    }
    override  fun onStop(){
        super.onStop()
        Log.i("ciclo-vida","On Stop")

    }
    override  fun onDestroy(){
        super.onDestroy()
        Log.i("ciclo-vida","On Destroy")

    }




}
