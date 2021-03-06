package com.example.twitchmvvmapp.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.twitchmvvmapp.data.models.Game
import com.example.twitchmvvmapp.data.models.Top
@Dao
interface GameDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insetOrUpdate(game: Game):Int

    @Delete
    suspend fun deleteGame(game:Game)
}