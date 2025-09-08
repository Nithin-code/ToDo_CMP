package com.nithin.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {


    @Upsert
    suspend fun upsert(task: Task)

    @Query("select * from task")
    fun getAllTasks() : Flow<List<Task>>

    @Delete
    fun deleteTask(task: Task)


}