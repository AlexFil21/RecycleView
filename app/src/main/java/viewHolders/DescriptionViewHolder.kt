package viewHolders

import adapterTypes.Description
import android.R
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_description.view.*

class DescriptionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val descrTextView: TextView

    init {
        descrTextView = itemView.description
    }


    fun setDescription(descr: Description) {
        val descriptionText = descr.getuserName()
        descrTextView.text = descriptionText
        itemView.toastBtn.setOnClickListener({ v ->

          val toast = Toast.makeText(v.getContext(), descriptionText, Toast.LENGTH_SHORT)
            val view = toast.view
            if (view != null) {
                view.background.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN)
            }
            val toastMessage =
                toast.view!!.findViewById<View>(R.id.message) as TextView
            toastMessage.setTextColor(Color.WHITE)
            toast.setGravity(Gravity.BOTTOM, 0, 100)
            toast.show()
        })
    }
}