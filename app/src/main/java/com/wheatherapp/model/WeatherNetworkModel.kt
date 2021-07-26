package com.wheatherapp.model

import com.google.gson.annotations.SerializedName

/**
 * Created by dharmesh on 25/07/21.
 */
data class WeatherNetworkModel(
    @SerializedName("id")
    var id: Int,
    @SerializedName("main")
    var main: String,
    @SerializedName("description")
    var description: String,
    @SerializedName("icon")
    var icon: String
)
