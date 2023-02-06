package com.example.mod9room

import androidx.room.ColumnInfo
import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Drink(
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0L,
    val name:String,
    @ColumnInfo(name= "alcool_degree")
    val alcoolDegree: Float,
    val origin:String
)
