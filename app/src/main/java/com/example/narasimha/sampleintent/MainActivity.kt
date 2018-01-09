package com.example.narasimha.sampleintent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Add the reference
        val myButton = findViewById<Button>(R.id.Mybutton)

        // setting on-click listener
        myButton.setOnClickListener {
            // Toast message
            Toast.makeText(this@MainActivity, "I am a Elephant.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }

    }
}
