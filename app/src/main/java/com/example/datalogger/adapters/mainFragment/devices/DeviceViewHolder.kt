package com.example.datalogger.adapters.mainFragment.devices

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.datalogger.ui.view.IndividualSensorDataDisplayActivity
import com.example.datalogger.R
import com.example.datalogger.adapters.mainFragment.sensors.SensorsAdapter
import com.example.datalogger.databinding.MainDeviceSectionRvBinding
import com.example.datalogger.model.DeviceData


class DeviceViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = MainDeviceSectionRvBinding.bind(view)
    val recyclerViewDeviceSections = view.findViewById<RecyclerView>(R.id.recyclerViewDeviceSections)

    @SuppressLint("SetTextI18n")
    fun render(deviceModel: List<List<DeviceData?>?>, mainContext: Context) {

        binding.deviceName.text = deviceModel[0]?.get(0)?.deviceId

        initRecyclerView(deviceModel, mainContext)
    }

    private fun initRecyclerView(state: List<List<DeviceData?>?>?, mainContext: Context){

        recyclerViewDeviceSections.layoutManager = LinearLayoutManager(mainContext)
        recyclerViewDeviceSections.adapter = SensorsAdapter(state, {onItemSelected(it)})
    }

    private fun onItemSelected(data: List<DeviceData?>){
        val sendData = arrayListOf<String?>()
        sendData.add(data[0]?.deviceId)
        if (data[0]?.hum != null){
            sendData.add("hum1")
        }else{
            sendData.add("temp1")
        }
        val intent = Intent(itemView.context, IndividualSensorDataDisplayActivity::class.java)
        intent.putExtra("data", sendData)
        itemView.context.startActivity(intent)
    }
}
