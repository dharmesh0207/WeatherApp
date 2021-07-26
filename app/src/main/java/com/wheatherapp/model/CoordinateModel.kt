package com.wheatherapp.model

import com.google.gson.annotations.SerializedName

/**
 * Created by dharmesh on 25/07/21.
 */
data class CoordinateModel(
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val lon: Double
)
