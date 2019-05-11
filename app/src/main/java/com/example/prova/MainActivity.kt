package com.example.prova

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProximo = findViewById<Button>(R.id.btnProximo)

        btnProximo.setOnClickListener {
            val i = Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(i)
        }
    }
}
