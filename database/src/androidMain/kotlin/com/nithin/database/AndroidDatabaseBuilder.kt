package com.nithin.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

fun getAndroidDatabaseBuilder(context: Context): RoomDatabase.Builder<TaskDatabase> {
    val databaseFile = context.getDatabasePath("task.db")
    return Room
        .databaseBuilder<TaskDatabase>(
            context = context.applicationContext,
            name = databaseFile.absolutePath,
        )
}