package br.senai.sp.jandira.imc_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textViewNome = findViewById<TextView>(R.id.text_view_nome)
        val textViewPeso = findViewById<TextView>(R.id.text_view_peso)
        val textViewAltura = findViewById<TextView>(R.id.text_view_altura)

        textViewNome.text = intent.getStringExtra("nome")
        textViewPeso.text = intent.getStringExtra("peso")
        textViewAltura.text = intent.getStringExtra("altura")

    }
}
