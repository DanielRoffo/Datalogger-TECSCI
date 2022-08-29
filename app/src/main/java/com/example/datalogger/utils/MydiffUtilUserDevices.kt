package com.example.datalogger.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.datalogger.model.DeviceData
import com.example.datalogger.model.UserDevice

class MydiffUtilUserDevices (private val oldList: List<UserDevice>,
                             private val newList: List<UserDevice>
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]

    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when{
            oldList[oldItemPosition].device == newList[newItemPosition].device -> {
                false
            }
            else -> true
        }
    }
}
