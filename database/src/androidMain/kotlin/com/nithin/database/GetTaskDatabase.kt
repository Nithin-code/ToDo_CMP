package com.nithin.database

import android.content.Context
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver

fun getTaskDatabase(context : Context) : TaskDatabase{
    val databaseFile = context.getDatabasePath("task.db")
    return Room
        .databaseBuilder<TaskDatabase>(
            context = context.applicationContext,
            name = databaseFile.absolutePath,
        )
        .setDriver(BundledSQLiteDriver())
        .build()
}