package com.example.twitchmvvmapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.twitchmvvmapp.data.models.Top
import com.example.twitchmvvmapp.data.models.TopGames

@Dao
interface TopGamesDao {

    @Query("SELECT * FROM top")
    fun getTopGames():LiveData<List<TopGames>>

}