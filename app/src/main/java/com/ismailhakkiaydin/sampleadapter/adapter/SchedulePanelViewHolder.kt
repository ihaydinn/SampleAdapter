package com.ismailhakkiaydin.sampleadapter.adapter

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.sampleadapter.databinding.ItemSchedulePanelBinding
import com.ismailhakkiaydin.sampleadapter.model.SchedulePanelDisplayItem

class SchedulePanelViewHolder(
    private val binding: ItemSchedulePanelBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(displayItem: SchedulePanelDisplayItem) {
        with(binding) {
            textViewTitle.text = displayItem.title
            textViewTitle.setTextColor(ContextCompat.getColor(itemView.context, displayItem.color))
            container.backgroundTintList =
                ContextCompat.getColorStateList(itemView.context, displayItem.backgroundTint)
        }
    }
}