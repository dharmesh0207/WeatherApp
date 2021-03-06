package com.wheatherapp.di.database.dao

import androidx.room.*
import com.wheatherapp.di.database.entities.Bookmark

/**
 * Created by dharmesh on 25/07/21.
 */
@Dao
interface BookmarkDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(bookmark: Bookmark): Long

    @Delete
    suspend fun delete(bookmark: Bookmark)

    @Query("SELECT * FROM bookmarks")
    suspend fun getAll(): List<Bookmark>

    @Query("SELECT * FROM bookmarks WHERE id= :locationId")
    suspend fun containBookMarkInDatabase(locationId:Int): List<Bookmark>
}
