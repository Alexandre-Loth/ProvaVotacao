package com.example.prova

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)

            btnConfirmar.setOnClickListener {
                fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
                    val dados = data?.getStringExtra(Intent.EXTRA_TEXT) ?: rbtnPresidente.toString()
                    Toast.makeText(this, dados, Toast.LENGTH_SHORT).show()

                    val intent = this.intent
                    intent.putExtra(Intent.EXTRA_TEXT, "Obrigado por participar pela entrevista. Você votou no ")
                    this.setResult(Activity.RESULT_OK, intent)
                    this.finish()
                }
            }
        }
}
