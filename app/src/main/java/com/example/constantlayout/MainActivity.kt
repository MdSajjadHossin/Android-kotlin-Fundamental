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

        btnApply.setOnClickListener{
            val firstName = etFirstName.text.toString();
            val lastName  = etLastName.text.toString();
            val country = etCountry.text.toString();
            val dob = etDoB.text.toString();
            Log.d("MainActivity", "$firstName, $lastName, form Country: $country, Birth On: $dob applied for visa")
        }
    }
}