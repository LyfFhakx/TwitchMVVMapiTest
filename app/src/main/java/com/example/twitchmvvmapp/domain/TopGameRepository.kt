package com.example.twitchmvvmapp.domain

import androidx.lifecycle.LiveData
import com.example.twitchmvvmapp.data.models.Game
import com.example.twitchmvvmapp.data.models.Top
import com.example.twitchmvvmapp.data.models.TopGameResponse
import com.example.twitchmvvmapp.data.models.TopGames
import retrofit2.Response

interface TopGameRepository {
    suspend fun getTopGames(pageNumber:Int):Response<TopGameResponse>

    suspend fun insertTop(top: Top):Int

    suspend fun insertGames(game: Game):Int

    fun getTopGames():LiveData<List<TopGames>>

    suspend fun deleteTop(top:Top)

    suspend fun deleteGame(game: Game)
}