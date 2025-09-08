package com.nithin.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor

@Database(
    entities = [Task::class],
    version = 1
)
@ConstructedBy(AppDatabaseConstructor::class)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao() : TaskDao

}

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object AppDatabaseConstructor : RoomDatabaseConstructor<TaskDatabase>{
    override fun initialize(): TaskDatabase
}