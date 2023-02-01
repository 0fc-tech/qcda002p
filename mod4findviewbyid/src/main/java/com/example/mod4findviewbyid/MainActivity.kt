package com.example.mod4findviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewHelloWorld = findViewById<TextView>(R.id.textViewHelloWorld)
        val editText = findViewById<EditText>(R.id.editText)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val button = findViewById<Button>(R.id.button)

        textViewHelloWorld.text = "Hello"
        editText.setText("Comment allez-vous?")
        ratingBar.rating = 3.0f
        button.setOnClickListener {
            Snackbar.make(this,it,"HELLOW ORLDE",1000).show()
        }
    }
}