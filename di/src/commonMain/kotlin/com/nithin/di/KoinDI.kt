package com.nithin.di

import com.nithin.database.CreateDatabase
import com.nithin.database.TaskDao
import com.nithin.database.TaskDatabase
import org.koin.dsl.module


val sharedModule = module {

    single<TaskDatabase> { CreateDatabase(get()).getDatabase() }

}