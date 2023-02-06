package com.example.mod9room

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.launch

class DrinkVM(val drinkDao: DrinkDao) : ViewModel() {
    val drink = MutableLiveData<Drink>()
    init {
        getFirstDrink()
    }
    fun getFirstDrink() {
        viewModelScope.launch{
            drink.value = drinkDao.getById(1L)
        }
    }
    fun insert(): MutableLiveData<List<Long>> {
        val resultInsert = MutableLiveData<List<Long>>()
        viewModelScope.launch {
            resultInsert.value = drinkDao.insertAll(listOf(
                Drink(0L,"Cidre",0.0f,"Breizh"),
                Drink(0L,"Vodka",5.5f,"URSS"),
                Drink(0L,"Breizh Cola", 0.0f, "Breizh"),
            ))
        }
        return resultInsert
    }
    companion object{
        val Factory:ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                return DrinkVM(
                    AppDatabase.getInstance(checkNotNull(extras[APPLICATION_KEY]))
                        .drinkDao()) as T
            }
        }
    }
}







