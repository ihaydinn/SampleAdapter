package com.ismailhakkiaydin.sampleadapter.model

sealed class ScheduleUIState {
    object Idle : ScheduleUIState()
    data class Success(val displayItem: List<DisplayItem>) : ScheduleUIState()
}