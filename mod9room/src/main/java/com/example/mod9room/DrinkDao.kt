package com.example.mod9room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DrinkDao {
    @Insert
    suspend fun insertAll(drinks : List<Drink>) : List<Long>

    @Query("SELECT * FROM Drink")
    fun getAll():List<Drink>

    @Query("SELECT * FROM Drink WHERE id = :id")
    suspend fun getById(id: Long): Drink

    @Update
    fun update(drink : Drink)

    @Delete
    fun delete(drink :Drink)
}





