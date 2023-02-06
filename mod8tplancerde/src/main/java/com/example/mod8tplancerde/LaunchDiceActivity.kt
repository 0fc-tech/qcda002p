package com.example.mod8tplancerde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod8tplancerde.databinding.ActivityLaunchDiceBinding
import kotlin.math.log

private const val TAG = "LaunchDiceActivity"
class LaunchDiceActivity : AppCompatActivity() {
    lateinit var binding : ActivityLaunchDiceBinding
    lateinit var  vm : LaunchDiceVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_launch_dice)
        vm = ViewModelProvider(this)[LaunchDiceVM::class.java]
        binding.diceVM = vm
        binding.lifecycleOwner = this
        vm.result.observe(this){result->
            Log.i(TAG, "onCreate: $result")
        }
        binding.button6.setOnClickListener{vm.launch(6) }
        binding.button8.setOnClickListener{vm.launch(8) }
        binding.button12.setOnClickListener{ vm.launch(12) }
        binding.button16.setOnClickListener{vm.launch(16) }
    }
}