package com.example.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class selectgender : AppCompatActivity() {
    private lateinit var textg: TextView
    private lateinit var btnfemale: RadioButton
    private lateinit var male: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectgender)

        textg = findViewById(R.id.textg)
        btnfemale = findViewById(R.id.btnfemale)
        male = findViewById(R.id.male)

        btnfemale.setOnClickListener {
            textg.text = "Female"
        }

        male.setOnClickListener {
            textg.text = "Male"
        }

    }
}