package com.example.newrv.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newrv.App
import com.example.newrv.ROOM.Table

class MyHandler : ViewModel() {
    var a : App
    get() { return a }
    set(value) { a = value }
}