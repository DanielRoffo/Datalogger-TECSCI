package com.example.datalogger.model

import java.time.LocalDate
import java.util.*

data class DeviceData(
    var id: String? = null,
    var deviceId: String? = null,
    var hum: String? = null,
    var temp: String? = null,
    var time: Date? = null
        )
