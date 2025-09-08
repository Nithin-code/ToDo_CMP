package com.nithin.todo.repository

import com.nithin.database.Task
import com.nithin.database.TaskDatabase

class ToDoRepository(
    private val database : TaskDatabase
) {

    suspend fun upsertTask(task: Task){
        database.taskDao().upsert(task)
    }

    suspend fun deleteTask(task: Task){
        database.taskDao().deleteTask(task)
    }

    fun getAllTasks() = database.taskDao().getAllTasks()

}