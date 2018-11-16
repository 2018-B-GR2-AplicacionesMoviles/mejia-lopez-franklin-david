package com.example.asemb.cliclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_cliclo_vida.*

class ClicloVidaActivity : AppCompatActivity() {
    var contador=0
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ciclo-vida","On Create")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cliclo_vida)

        val tieneContadorGuardado=savedInstanceState?.get(SAVE_INSTANCE_CONTADOR)as Int?

        if(tieneContadorGuardado!=null){
                contador=tieneContadorGuardado
                this.aumentarContador(0)
        }

        c_Contador.setOnClickListener{

            this.aumentarContador(1)

        }
    }

    fun aumentarContador(suma:Int){
        contador=contador+suma
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
    override  fun onRestart(){
        super.onRestart()
        Log.i("ciclo-vida","On Restart")

    }

    override fun onSaveInstanceState(outState: Bundle?) {

        Log.i("ciclo-vida","On onSaveInstanceState")

        outState?.run {
            putInt(SAVE_INSTANCE_CONTADOR,contador)
        }
        super.onSaveInstanceState(outState)


    }



    companion object {
        val SAVE_INSTANCE_CONTADOR="contador"
    }

}
