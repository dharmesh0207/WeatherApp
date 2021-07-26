package com.wheatherapp.model

import com.google.gson.annotations.SerializedName

/**
 * Created by dharmesh on 25/07/21.
 */
data class WindNetworkModel(
    @SerializedName("speed")
    var speed: Double,
    @SerializedName("deg")
    var degree: Double
)
