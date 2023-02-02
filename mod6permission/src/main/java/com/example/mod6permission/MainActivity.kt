package com.example.mod6permission

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    //Callback Demande permission dangereuse
    //Lorsque Android me renverra le retour de demande de permission
    //J'éxécuterai le callback avec comme paramètre isGranted (estAccordé en français)
    val requestPermissionCallLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()){
            isGranted->
                //Si la permission est accordée on déclenche callPhone
                if(isGranted) callPhone()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //On déclenche la demande de permission avec la permission à demander en paramètre
        requestPermissionCallLauncher.launch(android.Manifest.permission.CALL_PHONE)
    }
    //On appelle le numéro de téléphone sans demander aupravant à l'utilisateur
    fun callPhone(){
        Intent(
            Intent.ACTION_CALL,
            Uri.parse("tel:(+33)612345678")
        ).also { startActivity(it) }

    }
}