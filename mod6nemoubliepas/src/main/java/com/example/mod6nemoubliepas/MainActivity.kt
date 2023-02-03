package com.example.mod6nemoubliepas

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    var numberPhone :String? = null
    val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()){ isGranted ->
        numberPhone?.let { sendSMS(it) }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonSendSms).setOnClickListener {
            numberPhone = findViewById<EditText>(R.id.editTextPhone).text.toString()
            requestPermissionLauncher.launch(android.Manifest.permission.SEND_SMS)
        }

    }
    fun sendSMS(phone:String){
        Intent(Intent.ACTION_SENDTO, Uri.parse("sms:$phone")).also {
            it.putExtra("sms_body","REND MOI LES THUNES !")
            startActivity(it)
        }
    }
}