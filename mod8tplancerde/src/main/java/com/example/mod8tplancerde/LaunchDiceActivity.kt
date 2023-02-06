package com.example.mod8tplancerde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod8tplancerde.databinding.ActivityLaunchDiceBinding

class LaunchDiceActivity : AppCompatActivity() {
    lateinit var binding : ActivityLaunchDiceBinding
    lateinit var  vm : LaunchDiceVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_launch_dice)
        vm = ViewModelProvider(this)[LaunchDiceVM::class.java]
        binding.diceVM = vm
        binding.button6.setOnClickListener{
            vm.launch(6)
            binding.diceVM = vm
        }
        binding.button8.setOnClickListener{
            vm.launch(8)
            binding.diceVM = vm
        }
        binding.button12.setOnClickListener{
            vm.launch(12)
            binding.diceVM = vm
        }
        binding.button16.setOnClickListener{
            vm.launch(16)
            binding.diceVM = vm
        }
    }
}