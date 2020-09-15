package com.example.newrv

import android.app.Application
import androidx.room.Room
import com.example.newrv.ROOM.AppDatabase
import com.example.newrv.ROOM.TableDao

class App : Application() {
    private lateinit var db : AppDatabase
    private lateinit var tableDao : TableDao
    private lateinit var instance : App

    fun getInstanceData() : App {
        return instance
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "app-database-name"
        ).build()

        tableDao = db.tableDao()
    }

    fun getDatabase() : AppDatabase {
        return db
    }

    fun setDatabase(database: AppDatabase) {
        this.db = database
    }

    fun getTableDao() : TableDao {
        return tableDao
    }

    fun setTableDao(tabledao: TableDao) {
        this.tableDao = tabledao
    }
}