package com.example.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {
    private lateinit var etuser : EditText
    private lateinit var etpassword : EditText
    private lateinit var btnlogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        etuser = findViewById(R.id.etuser)
        etpassword = findViewById(R.id.etpassword)
        btnlogin = findViewById(R.id.btnlogin)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        
    }
}