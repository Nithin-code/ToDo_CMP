package com.nithin.todo

import android.app.Application
import com.nithin.di.androidDatabaseModule
import com.nithin.di.sharedModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ToDoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ToDoApplication)
            modules(androidDatabaseModule, sharedModule)
        }
    }

}