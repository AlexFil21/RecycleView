package com.example.newrv
import adapterTypes.Description
import adapterTypes.Header
import adapterTypes.Reclame
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var recyclerAdapter: MainAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = rv_list as RecyclerView

        val chatsList = arrayListOf<Any>()
        chatsList.add(Header("Recycle View Header"))
        chatsList.add(Description("Cardi B"))
        chatsList.add(Description("Drake"))
        chatsList.add(Description("Cardi B"))
        chatsList.add(Description("Drake"))
        chatsList.add(Reclame(R.drawable.reclame))
        chatsList.add(Description("Cardi B"))
        chatsList.add(Description("Drake"))
        chatsList.add(Description("Cardi B"))
        chatsList.add(Description("Drake"))
        chatsList.add(Reclame(R.drawable.reclame))
        chatsList.add(Description("Cardi B"))
        chatsList.add(Description("Drake"))
        chatsList.add(Description("Cardi B"))
        chatsList.add(Description("Drake"))
        chatsList.add(Reclame(R.drawable.reclame))

        val layoutManager = LinearLayoutManager(this)
        list!!.setLayoutManager(layoutManager)
        recyclerAdapter = MainAdapter(this, chatsList)
        list!!.setAdapter(recyclerAdapter)
    }
}