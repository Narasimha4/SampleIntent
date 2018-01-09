package com.example.narasimha.sampleintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Add the reference
        val elephantButton = findViewById<Button>(R.id.myButton1)

        // setting on-click listener
        elephantButton.setOnClickListener {
            // Toast message
            Toast.makeText(this, "I am a Baby.", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}
