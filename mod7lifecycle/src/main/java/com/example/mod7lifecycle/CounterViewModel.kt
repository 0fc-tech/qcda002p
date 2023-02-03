package com.example.mod7lifecycle

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counter = 0
        private set
    fun plusUn() = ++counter
}