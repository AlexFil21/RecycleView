package com.example.newrv
import com.example.newrv.adapterTypes.Description
import com.example.newrv.adapterTypes.Header
import com.example.newrv.adapterTypes.Reclame
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newrv.viewModel.MyHandler
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var recyclerAdapter: MainAdapter? = null
    var handler = MyHandler()

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


        val layoutManager = LinearLayoutManager(this)
        list!!.setLayoutManager(layoutManager)
       // recyclerAdapter = MainAdapter(this, chatsList)
        list!!.setAdapter(recyclerAdapter)

        addNewItem.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, AddItemActivity::class.java)
            startActivity(intent)
        })

        handler.a!!.getTableDao().getAllLiveData().observe(this, Observer {
                Log.i("Info", it.size.toString())
        })
    }

}