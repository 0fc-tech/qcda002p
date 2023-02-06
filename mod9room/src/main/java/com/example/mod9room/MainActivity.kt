package com.example.mod9room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod9room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var vm : DrinkVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this,DrinkVM.Factory)[DrinkVM::class.java]
        binding.vm = vm
        binding.lifecycleOwner =this
        vm.insert().observe(this){
            vm.getFirstDrink()
        }
    }
}