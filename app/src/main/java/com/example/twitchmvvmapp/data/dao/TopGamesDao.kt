package com.example.twitchmvvmapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.twitchmvvmapp.data.models.Top

@Dao
interface TopGamesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(top: Top):Int

    @Query("SELECT * FROM top")
    fun getTopGames():LiveData<List<Top>>

    @Delete
    suspend fun delete(top:Top)

}