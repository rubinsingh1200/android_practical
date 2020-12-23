package com.example.practical

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class PersonalDetail : AppCompatActivity() {
    private lateinit var etName:EditText
    private lateinit var etAddress:EditText
    private lateinit var etMobile:EditText
    private lateinit var btnfemale:RadioButton
    private lateinit var btnmale:RadioButton
    private lateinit var btnsubmit:Button
    var gender = ""
    var list = arrayListOf<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_detail)

        etName = findViewById(R.id.etName)
        etAddress = findViewById(R.id.etAddress)
        etMobile = findViewById(R.id.etMobile)
        btnfemale = findViewById(R.id.btnfemale)
        btnmale = findViewById(R.id.btnmale)
        btnsubmit = findViewById(R.id.btnSubmit)

        btnmale.setOnClickListener {
            gender="Male"
        }
        btnfemale.setOnClickListener {
            gender="Female"
        }

        btnsubmit.setOnClickListener {
            var person = Person(etName.text.toString(),etAddress.text.toString(),etMobile.text.toString(),gender)
            list.add(person)
            startActivity(Intent(this, PersonalDetail2 :: class.java).putExtra("data",list))
        }
    }
}
