package com.example.practical

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.net.Inet4Address
import java.util.*

class display_form : AppCompatActivity() {
    private lateinit var etName: EditText
    private lateinit var spin: Spinner
    private lateinit var tvAddress: AutoCompleteTextView
    private lateinit var tvDate: TextView
    private lateinit var btnSubmit: Button
    private lateinit var tvOutput: TextView
    private val department = arrayOf("Management", "Android", "Development", "Fees")
    private val address = arrayOf("Sankhamul", "Baneshwor", "Butwal", "Hattiban")
    var selectedItem = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_form)

        etName = findViewById(R.id.etName)
        spin = findViewById(R.id.spin)
        tvAddress = findViewById(R.id.tvAddress)
        tvDate = findViewById(R.id.tvDate)
        btnSubmit = findViewById(R.id.btnSubmit)
        tvOutput = findViewById(R.id.tvOutput)

        //Spinner

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            department
        )

        spin.adapter = adapter
        spin.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                    selectedItem = parent?.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        //Spinner end

        //Autocomplete

        val autoCompleteAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            address
        )
        tvAddress.setAdapter(autoCompleteAdapter)
        tvAddress.threshold=1
        // Autocomplete end

        //Calender
        tvDate.setOnClickListener {
            loadCalender()
        }
        //Calender end

        btnSubmit.setOnClickListener {
            tvOutput.text = "Name: ${etName.text}  Department: $selectedItem  Address: ${tvAddress.text}  Date Joined: ${tvDate.text}"
        }


    }
    private fun loadCalender(){
        val c= Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener {
                    view, yearNew, monthOfYear, dayOfMonth ->
                tvDate.setText("$dayOfMonth-${month + 1}-$yearNew")
            },
            year,
            month,
            day
        ).show()

    }
}