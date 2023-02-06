package com.example.mod8counterlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod8counterlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var vm : CounterVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this)[CounterVM::class.java]
        binding.vm = vm
        //On écoute les changements des liveData dans le viewModel
        //Dès que la donnée change, on affiche les MAJ dans le layout
        binding.lifecycleOwner = this
        //Maintenant, nous n'avons plus à spécifier binding.vm = vm
        //puisque les données sont mises à jour via les LiveData
        binding.buttonMinus.setOnClickListener { vm.decrement() }
        binding.buttonPlus.setOnClickListener { vm.increment() }
    }
}