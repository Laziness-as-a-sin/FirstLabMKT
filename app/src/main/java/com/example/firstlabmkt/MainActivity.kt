package com.example.firstlabmkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
//        val button:Button = findViewById(R.id.button);
        setContentView(R.layout.activity_main)

        super.onCreate(savedInstanceState)
        textView  = findViewById(R.id.textView)
    }

    fun hello(view: View){
        textView.setText("Hello there!")
        val tempTost = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        tempTost.show()
    }

}