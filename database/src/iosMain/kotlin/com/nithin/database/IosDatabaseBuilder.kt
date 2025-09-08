package com.nithin.database

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import platform.Foundation.NSHomeDirectory

fun getIosDatabaseBuilder() : RoomDatabase.Builder<TaskDatabase>{
    val dbFile = NSHomeDirectory()+"task.dp"
    return Room
        .databaseBuilder<TaskDatabase>(
            name = dbFile,
            factory = { TaskDatabase::class.instantiateImpl() }
        )
}