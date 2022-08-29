package com.example.datalogger.adapters.indSensorData

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.datalogger.databinding.SingleSensorDataRvBinding
import com.example.datalogger.model.DeviceData
import com.example.datalogger.model.SensorData
import java.text.SimpleDateFormat

class IndSensorDataViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val dateFormated = SimpleDateFormat("dd/MM/yy || HH:mm:ss")
    val binding = SingleSensorDataRvBinding.bind(view)

    fun render(deviceModel: SensorData){

        binding.value.text = deviceModel.sensorVal
        binding.time.text = dateFormated.format(deviceModel.time)
        binding.alarm.text = "---"
    }
}