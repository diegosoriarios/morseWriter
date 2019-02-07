package com.example.diegorios.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dot(view: View){
        val showString = findViewById<TextView>(R.id.textView2)
        val stringValue = showString.text.toString()
        var word = stringValue
        word += "."
        showString.text = word
    }

    fun hash(view: View){
        val showString = findViewById<TextView>(R.id.textView2)
        val stringValue = showString.text.toString()
        var word = stringValue
        word += "-"
        showString.text = word
    }

    fun space(view: View){
        val showString = findViewById<TextView>(R.id.textView2)
        val stringValue = showString.text.toString()
        var word = stringValue
        word += " "
        showString.text = word
    }
}
