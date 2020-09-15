package com.example.newrv.ROOM

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*

@Dao
interface TableDao {
    @Query("SELECT * FROM `Table`")
    fun getAll(): List<Table>

    @Query("SELECT * FROM `Table`")
    fun getAllLiveData(): MutableLiveData<List<Table>>

    @Query("SELECT * FROM `Table` WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Table>

    @Insert
    fun insertAll(item: Table)

    @Update
    fun update(table: Table)

    @Delete
    fun delete(item: Table)
}