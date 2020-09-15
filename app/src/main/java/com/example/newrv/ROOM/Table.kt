package com.example.newrv.ROOM

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Table (
    @PrimaryKey (autoGenerate = true)
    val uid: Int,

    @ColumnInfo(name = "first_column")
    var textColumn: String?
)