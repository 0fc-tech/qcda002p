package com.example.mod5racontehistoire.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Histoire(val prenom: String = "Simon", val lieu: String = "Chateau"): Parcelable
