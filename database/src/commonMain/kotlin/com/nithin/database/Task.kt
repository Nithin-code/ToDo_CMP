package com.nithin.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id : Int ,
    val taskName : String,
    val startDate : String,
    val endDate : String,
    val taskStatus : String
)
