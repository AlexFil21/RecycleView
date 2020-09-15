package com.example.newrv.viewHolders

import com.example.newrv.adapterTypes.Reclame
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_reclame.view.*

class ReclameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val img : ImageView

    init {
        img = itemView.rvReclame
    }

    fun setReclameImg (reclame: Reclame) {
        val reclameImg = reclame.getImage()
        img.setImageResource(reclameImg)
    }
}