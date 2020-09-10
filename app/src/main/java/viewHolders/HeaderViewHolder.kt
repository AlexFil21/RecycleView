package viewHolders

import adapterTypes.Header
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycleview_header.view.*

class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val headerTextView: TextView

    init {
        headerTextView = itemView.rvHeader
    }

    fun setHeaderText(title: Header) {
        val headerText = title.getTitle()
        headerTextView.text = headerText
    }

}