package com.example.newrv

import android.app.Application
import androidx.room.Room
import com.example.newrv.ROOM.AppDatabase
import com.example.newrv.ROOM.Table
import com.example.newrv.ROOM.TableDao

class App : Application() {
    private lateinit var db : AppDatabase
    private lateinit var tableDao : TableDao

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "app-database-name"
        ).build()

        tableDao = db.tableDao()
    }

    fun getTableDao() : TableDao {
        return tableDao
    }

    fun setTableDao(tabledao: ArrayList<Table>) {
        tableDao.insertAll(tabledao)
    }
}