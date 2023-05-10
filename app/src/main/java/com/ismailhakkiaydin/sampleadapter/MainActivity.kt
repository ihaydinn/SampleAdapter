package com.ismailhakkiaydin.sampleadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.ismailhakkiaydin.sampleadapter.adapter.ScheduleAdapter
import com.ismailhakkiaydin.sampleadapter.databinding.ActivityMainBinding
import com.ismailhakkiaydin.sampleadapter.model.ScheduleUIState
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var scheduleAdapter: ScheduleAdapter? = null
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this)[ScheduleViewModel::class.java]

        binding.recyclerView.adapter = ScheduleAdapter().apply {
            scheduleAdapter = this
        }

        viewModel.setData()

        lifecycleScope.launch {
            viewModel.uiState.collect {
                when(it){
                    ScheduleUIState.Idle -> Unit
                    is ScheduleUIState.Success -> {
                        scheduleAdapter?.submitList(it.displayItem)
                    }
                }
            }
        }
    }
}