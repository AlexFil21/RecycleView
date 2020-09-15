package com.example.newrv.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newrv.App
import com.example.newrv.ROOM.Table

class MyHandler : ViewModel() {
    var a : App? = null
    private var tableLiveData : MutableLiveData<List<Table>>  = a!!.getInstanceData().getTableDao().getAllLiveData()

    fun getTableLiveData() : LiveData<List<Table>> {
        return tableLiveData
    }

    fun addTableData (table: Table) {
        a!!.getInstanceData().getTableDao().insertAll(table)
    }

}