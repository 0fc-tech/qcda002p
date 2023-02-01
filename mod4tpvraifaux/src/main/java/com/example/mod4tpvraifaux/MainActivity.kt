package com.example.mod4tpvraifaux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mod4tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    var index = 0
    val qr = listOf(QuestionReponse("Est-ce que la terre est plate?", true),
        QuestionReponse("Est-ce que les chemtrails sont là pour nous tuer?", true),
        QuestionReponse("Les illuminatis sont parmi nous?", true),
        QuestionReponse("On dit chocolatine!", false),
        QuestionReponse("Les dinosaures existent encore?", true),
        QuestionReponse("Macron est un dissident marsien illuminati et reptilien", true),)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        amb.score = 0
        amb.qr = qr[index]
        amb.buttonTrue.setOnClickListener { checkResponseUser(true) }
        amb.buttonFalse.setOnClickListener {  checkResponseUser(false)}
    }

    fun checkResponseUser(responseUser : Boolean){
        if(responseUser == qr[index].reponse){
            amb.score = amb.score!!+1
        }
        if( index +1 == qr.size){
            amb.buttonTrue.isEnabled = false
            amb.buttonFalse.isEnabled = false
            return
        }
        amb.qr = qr[++index]
    }
}






