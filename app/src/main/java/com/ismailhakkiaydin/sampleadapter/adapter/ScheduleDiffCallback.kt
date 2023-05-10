package com.ismailhakkiaydin.sampleadapter.adapter

import androidx.recyclerview.widget.DiffUtil
import com.ismailhakkiaydin.sampleadapter.model.DisplayItem

class ScheduleDiffCallback : DiffUtil.ItemCallback<DisplayItem>(){
    override fun areItemsTheSame(oldItem: DisplayItem, newItem: DisplayItem): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: DisplayItem, newItem: DisplayItem): Boolean {
        return oldItem == newItem
    }
}