package com.ismailhakkiaydin.sampleadapter.model

import androidx.annotation.ColorRes

class SchedulePanelDisplayItem(
    val title: String,
    @ColorRes
    val backgroundTint: Int,
    @ColorRes
    val color: Int
) : DisplayItem {
    override fun type(): Int = ScheduleItemType.PANEL.type
}