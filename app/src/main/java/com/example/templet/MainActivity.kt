package com.example.templet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerid=findViewById<Spinner>(R.id.spinner)
        val data= arrayOf<String>("","17","18","19","20")
        val spinnerAdapter=ArrayAdapter(this,R.layout.layout,data)

        spinnerid.adapter=spinnerAdapter

        val spinnerid2=findViewById<Spinner>(R.id.spinner2)
        val data2= arrayOf<String>("","Male","Female")
        val spinnerAdapter2=ArrayAdapter(this,R.layout.layout,data2)

        spinnerid2.adapter=spinnerAdapter2
    }
}