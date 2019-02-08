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

    fun deleteChar(view: View){
        val showString = findViewById<TextView>(R.id.textView2)
        val stringValue = showString.text.toString()
        var word = stringValue
        if(word.length > 0){
            word = word.substring(0, (word.length - 1))
            showString.text = word
        }
    }
}
