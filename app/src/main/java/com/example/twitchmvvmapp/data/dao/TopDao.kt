package com.example.twitchmvvmapp.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.twitchmvvmapp.data.models.Top

@Dao
interface TopDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insetOrUpdate(top: Top):Int

    @Delete
    suspend fun deleteTop(top:Top)
}