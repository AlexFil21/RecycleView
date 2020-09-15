package com.example.newrv.ROOM

import androidx.lifecycle.MutableLiveData
import androidx.room.*

@Dao
interface TableDao {
    @Query("SELECT * FROM `Table`")
    fun getAllLiveData(): MutableLiveData<List<Table>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(table: ArrayList<Table>)

    @Delete
    fun delete(item: Table)
}