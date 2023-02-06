package com.example.mod8tplancerde

import androidx.lifecycle.ViewModel

class LaunchDiceVM:ViewModel() {
    var result = 0

    fun launch(valDiceMax : Int){
        result = (1..valDiceMax).random()
    }
}