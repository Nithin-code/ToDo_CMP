package com.nithin.di

import androidx.room.RoomDatabase
import com.nithin.database.TaskDatabase
import com.nithin.database.getIosDatabaseBuilder
import org.koin.dsl.module

val iosDatabaseModule = module {
    single<RoomDatabase.Builder<TaskDatabase>> { getIosDatabaseBuilder() }
}