package com.example.constantlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnEnter.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name)
                it.putExtra("EXTRA_AGE", age)
                it.putExtra("EXTRA_COUNTRY", country)
                startActivity(it)
            }
        }


    }
}