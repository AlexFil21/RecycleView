package com.example.newrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newrv.ROOM.Table
import kotlinx.android.synthetic.main.activity_add_item.*
import com.example.newrv.viewModel.MyHandler

class AddItemActivity : AppCompatActivity() {
    val handler = MyHandler()
    var table : Table? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        add_new_item_btn.setOnClickListener({
            if (new_item_text_field.text.length > 0) {
                table?.textColumn = new_item_text_field.text.toString()
                handler.addTableData(table!!)
            }
        })

    }
}