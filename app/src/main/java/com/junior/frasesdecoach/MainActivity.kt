package com.junior.frasesdecoach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFrase = findViewById<Button>(R.id.btn_gerar_frase)

        btnFrase.setOnClickListener(View.OnClickListener {
            gerar(btnFrase)
        })
    }

    fun gerar(view: View){
        val sorteio = Random.nextInt(0, 10)
        Log.i("sorteio", "numero sorteado: $sorteio")

        var frase = when(sorteio){
            1 -> getString(R.string.frase1);
            2 -> getString(R.string.frase2);
            3 -> getString(R.string.frase3);
            4 -> getString(R.string.frase4);
            5 -> getString(R.string.frase5);
            6 -> getString(R.string.frase6);
            7 -> getString(R.string.frase7);
            8 -> getString(R.string.frase8);
            9 -> getString(R.string.frase9);
            else -> getString(R.string.frase10);
        }

        var txt = findViewById<TextView>(R.id.txt_frase)

        txt.text = frase
        Log.i("sorteio", "numero sorteado: " +frase[sorteio])
    }
}