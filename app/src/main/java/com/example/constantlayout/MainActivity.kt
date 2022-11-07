package com.example.constantlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
           val firstNumber =  firstNumber.text.toString().toInt();
           val secondNumber =  etSecondNumber.text.toString().toInt();

            val result = firstNumber + secondNumber;
            tvResult.text = result.toString()
        }

    }
}