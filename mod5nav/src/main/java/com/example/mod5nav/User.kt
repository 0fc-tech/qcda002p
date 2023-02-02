package com.example.mod5nav

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(val nom :String, val prenom :String,val email:String) : Parcelable
