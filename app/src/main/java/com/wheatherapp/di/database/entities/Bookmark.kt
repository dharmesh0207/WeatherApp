package com.wheatherapp.di.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by dharmesh on 25/07/21.
 */
@Entity(tableName = "bookmarks")
data class Bookmark constructor(
    @PrimaryKey var id: Int,
    @ColumnInfo(name = "latitude") var latitude: Double,
    @ColumnInfo(name = "longitude") var longitude: Double
)
