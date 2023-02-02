package com.example.mod6intentimplicite

import android.content.Intent
import android.content.Intent.*
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Intent(
        //    ACTION_VIEW,
        //    Uri.parse("geo:47.9774595,-4.0835291")
        //).also { startActivity(it) }
        Intent(
            ACTION_DIAL,
            Uri.parse("tel:0812345678")
        ).also { startActivity(it) }
    }
}







