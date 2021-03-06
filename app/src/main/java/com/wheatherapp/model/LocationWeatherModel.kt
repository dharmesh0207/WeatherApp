package com.wheatherapp.model

/**
 * Created by dharmesh on 25/07/21.
 */
data class LocationWeatherModel(
    var id: Int,
    var isBookmarked: Boolean = false,
    var name: String,
    val lat: Double,
    val lon: Double,
    var windSpeed: Double?,
    var windDegree: Double?,
    var temp: Int,
    var tempMax: Int,
    var tempMin: Int,
    var humidity: Int,
    var pressure: Int,
    var clouds: Int
)
