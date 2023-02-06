package com.example.mod8counterlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterVM :ViewModel() {
    val counter = MutableLiveData(0)
    fun increment() {
        counter.value = counter.value?.plus(1)
    }
    fun decrement() {
        counter.value = counter.value?.minus(1)
    }
}