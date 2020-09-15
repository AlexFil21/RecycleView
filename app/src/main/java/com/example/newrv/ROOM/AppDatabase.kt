package com.example.newrv.ROOM

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Table::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tableDao(): TableDao
}