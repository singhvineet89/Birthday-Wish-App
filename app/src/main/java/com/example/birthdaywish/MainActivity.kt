package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edttxt : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn: Button = findViewById(R.id.button)
        edttxt = findViewById(R.id.entertext)

        btn.setOnClickListener {
            BirthdayCard(it)

        }


    }
    fun BirthdayCard(view: View){
        val name= edttxt.editableText.toString()
        val intent : Intent = Intent( this, Birthdaygreet:: class.java)
        intent.putExtra("name",name)

        startActivity(intent)
    }
}