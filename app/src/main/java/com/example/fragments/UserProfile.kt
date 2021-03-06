package com.example.fragments

import android.graphics.Bitmap
import android.net.Uri
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserProfile(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "userDetailId")
    var userDetailId : Int = 0,
    var userEmail : String = "",
    var userAge : String = "",
    var userSchool : String = "",
    var userJob : String = ""

    )
