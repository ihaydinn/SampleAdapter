package com.ismailhakkiaydin.sampleadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.sampleadapter.model.DisplayItem
import com.ismailhakkiaydin.sampleadapter.model.ScheduleItemType
import com.ismailhakkiaydin.sampleadapter.model.SchedulePanelDisplayItem
import com.ismailhakkiaydin.sampleadapter.model.ScheduleRowDisplayItem
import com.ismailhakkiaydin.sampleadapter.databinding.ItemSchedulePanelBinding
import com.ismailhakkiaydin.sampleadapter.databinding.ItemScheduleRowBinding

class ScheduleAdapter : ListAdapter<DisplayItem, RecyclerView.ViewHolder>(ScheduleDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (ScheduleItemType.getWithType(viewType)) {
            ScheduleItemType.ROW -> ScheduleRowViewHolder(
                binding = ItemScheduleRowBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            ScheduleItemType.PANEL -> SchedulePanelViewHolder(
                binding = ItemSchedulePanelBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val displayItem = getItem(position)

        when (holder) {
            is ScheduleRowViewHolder -> {
                holder.bind(displayItem as ScheduleRowDisplayItem)
            }
            is SchedulePanelViewHolder -> {
                holder.bind(displayItem as SchedulePanelDisplayItem)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).type()
    }
}