package com.example.newrv
import com.example.newrv.adapterTypes.Description
import com.example.newrv.adapterTypes.Header
import com.example.newrv.adapterTypes.Reclame
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newrv.viewHolders.DescriptionViewHolder
import com.example.newrv.viewHolders.HeaderViewHolder
import com.example.newrv.viewHolders.ReclameViewHolder

class MainAdapter( var context: Context, var mData: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_DESCRIPTION: Int = 1
    private val TYPE_RECLAME: Int = 2
    private val TYPE_HEADER: Int = 3

    override fun getItemViewType(position: Int): Int {
        return when (mData[position]) {
            is Description -> {
                TYPE_DESCRIPTION
            }
            is Header -> {
                TYPE_HEADER
            }
            else -> {
                TYPE_RECLAME
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var layout = 0
        val viewHolder: RecyclerView.ViewHolder?
        when (viewType) {
            TYPE_DESCRIPTION -> {
                layout = R.layout.recyclerview_description
                val descrView = LayoutInflater.from(parent.context).inflate(layout, parent, false)
                viewHolder = DescriptionViewHolder(descrView)
            }
            TYPE_HEADER -> {
                layout = R.layout.recycleview_header
                val headerView = LayoutInflater.from(parent.context).inflate(layout, parent, false)
                viewHolder = HeaderViewHolder(headerView)

            }
            TYPE_RECLAME -> {
                layout = R.layout.recyclerview_reclame
                val reclameView = LayoutInflater.from(parent.context).inflate(layout, parent, false)
                viewHolder = ReclameViewHolder(reclameView)
            }
            else -> viewHolder = null
        }
        return viewHolder!!
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewType = holder.itemViewType
        when (viewType) {
            TYPE_DESCRIPTION -> {
                val chat = mData[position] as Description
                (holder as DescriptionViewHolder).setDescription(chat)
            }
            TYPE_HEADER -> {
                val header = mData[position] as Header
                (holder as HeaderViewHolder).setHeaderText(header)
            }
            TYPE_RECLAME -> {
                val reclame = mData[position] as Reclame
                (holder as ReclameViewHolder).setReclameImg(reclame)
            }
        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }
}
