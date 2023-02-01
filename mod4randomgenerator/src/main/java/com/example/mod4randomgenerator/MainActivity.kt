package com.example.mod4randomgenerator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewResult = findViewById<TextView>(R.id.textViewResult);
        val editTextMin = findViewById<EditText>(R.id.editTextMin);
        val editTextMax = findViewById<EditText>(R.id.editTextMax);
        val buttonGenerate = findViewById<Button>(R.id.button);
        buttonGenerate.setOnClickListener {
            currentFocus?.let { view ->
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
                imm?.hideSoftInputFromWindow(view.windowToken, 0)
            }
            val min = editTextMin.text.toString().toInt()
            val max = editTextMax.text.toString().toInt()
            if(min > max)
                Snackbar.make(it,"La borne minimum est plus grande que maximum",5).show()
            else
                textViewResult.text=(min..max).random().toString()
        }
    }
}