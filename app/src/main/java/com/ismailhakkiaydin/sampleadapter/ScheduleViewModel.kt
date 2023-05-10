package com.ismailhakkiaydin.sampleadapter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ismailhakkiaydin.sampleadapter.model.DisplayItem
import com.ismailhakkiaydin.sampleadapter.model.SchedulePanelDisplayItem
import com.ismailhakkiaydin.sampleadapter.model.ScheduleRowDisplayItem
import com.ismailhakkiaydin.sampleadapter.model.ScheduleUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ScheduleViewModel : ViewModel() {

    private val _uiState: MutableStateFlow<ScheduleUIState> = MutableStateFlow(ScheduleUIState.Idle)
    val uiState = _uiState.asStateFlow()

    fun setData() {
        viewModelScope.launch {
            _uiState.emit(ScheduleUIState.Success(displayItem = setDisplayItems()))
        }
    }

    private fun setDisplayItems(): List<DisplayItem> {
        val displayItems: MutableList<DisplayItem> = mutableListOf()

        displayItems.add(
            ScheduleRowDisplayItem(
                title = "Sabah Sporu",
                startDate = "7:00 am",
                endDate = "7:30 am",
                R.color.color1,
                R.color.title1
            )
        )
        displayItems.add(
            ScheduleRowDisplayItem(
                title = "Sabah Sporu",
                startDate = "7:00 am",
                endDate = "7:30 am",
                R.color.color2,
                R.color.title2
            )
        )
        displayItems.add(
            ScheduleRowDisplayItem(
                title = "Sabah Sporu",
                startDate = "7:00 am",
                endDate = "7:30 am",
                R.color.color3,
                R.color.title3
            )
        )
        displayItems.add(
            SchedulePanelDisplayItem(
                title = "Header",
                backgroundTint = R.color.color1,
                color = R.color.title1
            )
        )
        displayItems.add(
            ScheduleRowDisplayItem(
                title = "Sabah Sporu",
                startDate = "7:00 am",
                endDate = "7:30 am",
                R.color.color4,
                R.color.title4
            )
        )
        displayItems.add(
            ScheduleRowDisplayItem(
                title = "Sabah Sporu",
                startDate = "7:00 am",
                endDate = "7:30 am",
                R.color.color2,
                R.color.title2
            )
        )
        displayItems.add(
            SchedulePanelDisplayItem(
                title = "Header",
                backgroundTint = R.color.color3,
                color = R.color.title1
            )
        )

        return displayItems.toMutableList()
    }
}