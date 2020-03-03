package br.senai.sp.jandira.imc_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // *** Instanciando as classes referentes aos
        // *** componentes(View) da activity
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val editTextPeso = findViewById<EditText>(R.id.edit_text_peso)
        val editTextAltura = findViewById<EditText>(R.id.edit_text_altura)

        buttonCalcular.setOnClickListener {



        }



    }
}
