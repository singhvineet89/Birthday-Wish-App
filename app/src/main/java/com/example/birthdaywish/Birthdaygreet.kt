package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Birthdaygreet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreet)

        val secText = findViewById<TextView>(R.id.secondTextView)

        val intentValue = intent.getStringExtra("name")
        secText.setText(intentValue)
    }
}