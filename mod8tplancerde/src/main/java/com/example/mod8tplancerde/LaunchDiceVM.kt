package com.example.mod8tplancerde

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LaunchDiceVM:ViewModel() {
    var result = MutableLiveData(0)

    fun launch(valDiceMax : Int){
        result.value = (1..valDiceMax).random()
    }
}