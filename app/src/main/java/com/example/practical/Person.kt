package com.example.practical

import android.location.Address
import java.io.Serializable

class Person:Serializable {
    private lateinit var Name: String;
    private lateinit var Address: String;
    private lateinit var Mobile: String;
    private lateinit var Gender: String;
    constructor(name:String,address: String, gender: String, mobile: String){
        this .Name = name;
        this .Address = address;
        this .Mobile = mobile;
        this .Gender = gender;
    }

    override fun toString(): String {
        return Name;
    }



}