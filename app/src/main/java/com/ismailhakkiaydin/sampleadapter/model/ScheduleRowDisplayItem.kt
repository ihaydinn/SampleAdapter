package com.ismailhakkiaydin.sampleadapter.model

import androidx.annotation.ColorRes

data class ScheduleRowDisplayItem(
    val title: String,
    val startDate: String,
    val endDate: String,
    @ColorRes
    val backgroundTint: Int,
    @ColorRes
    val color: Int
): DisplayItem {
    override fun type(): Int = ScheduleItemType.ROW.type
}