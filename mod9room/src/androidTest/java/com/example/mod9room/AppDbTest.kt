package com.example.mod9room

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppDbTest {
    lateinit var dbTest: AppDatabase
    @Before
    fun preconfigureTestDB(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        dbTest = Room.inMemoryDatabaseBuilder(
            context, AppDatabase::class.java).build()
    }
    @Test
    fun testInsert(){
        dbTest.drinkDao().insertAll(listOf(
            Drink(0L,"Cidre",0.0f,"Breizh"),
            Drink(0L,"Vodka",5.5f,"URSS"),
            Drink(0L,"Breizh Cola", 0.0f, "Breizh"),
        ))
        val firstDrink = dbTest.drinkDao().getById(1)
        assert(firstDrink.name == "Cidre")
    }
}