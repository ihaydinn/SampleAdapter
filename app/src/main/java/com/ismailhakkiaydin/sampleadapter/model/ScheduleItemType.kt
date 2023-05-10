package com.ismailhakkiaydin.sampleadapter.model

enum class ScheduleItemType(val type: Int) {
    ROW(0), PANEL(1);

    companion object {
        fun getWithType(type: Int): ScheduleItemType {
            return values().firstOrNull { it.type == type } ?: ROW
        }
    }
}