package com.example.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Drink::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    //On liste nos DAO
    abstract fun drinkDao() : DrinkDao

    companion object{
        @Volatile
        private var INSTANCE : AppDatabase? = null
        fun getInstance(context: Context): AppDatabase{
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(context,AppDatabase::class.java,"drinks")
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}