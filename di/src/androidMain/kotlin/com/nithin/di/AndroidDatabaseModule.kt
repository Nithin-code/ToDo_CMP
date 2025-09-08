package com.nithin.di

import androidx.room.RoomDatabase
import com.nithin.database.TaskDatabase
import com.nithin.database.getAndroidDatabaseBuilder
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val androidDatabaseModule = module {
    single<RoomDatabase.Builder<TaskDatabase>> {
        getAndroidDatabaseBuilder(androidContext())
    }
}
