package com.ismailhakkiaydin.sampleadapter.adapter

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.sampleadapter.databinding.ItemScheduleRowBinding
import com.ismailhakkiaydin.sampleadapter.model.ScheduleRowDisplayItem

class ScheduleRowViewHolder(
    private val binding: ItemScheduleRowBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(displayItem: ScheduleRowDisplayItem) {
        with(binding) {
            textViewTitle.text = displayItem.title
            textViewDate.text = displayItem.startDate + " - " + displayItem.endDate
            textViewTitle.setTextColor(ContextCompat.getColor(itemView.context, displayItem.color))
            viewPoint.backgroundTintList = ContextCompat.getColorStateList(itemView.context, displayItem.color)
            containerRow.backgroundTintList =
                ContextCompat.getColorStateList(itemView.context, displayItem.backgroundTint)
        }
    }
}