package com.example.twitchmvvmapp.data.repository

import androidx.lifecycle.LiveData
import com.example.twitchmvvmapp.data.AppDatabase
import com.example.twitchmvvmapp.data.models.Game
import com.example.twitchmvvmapp.data.models.Top
import com.example.twitchmvvmapp.data.models.TopGameResponse
import com.example.twitchmvvmapp.data.models.TopGames
import com.example.twitchmvvmapp.data.net.RetrofitInstance
import com.example.twitchmvvmapp.domain.TopGameRepository
import retrofit2.Response

class TopGameRepositoryImpl(
    private val appDatabase: AppDatabase
) : TopGameRepository {
    override suspend fun getTopGames(pageNumber: Int): Response<TopGameResponse> =
        RetrofitInstance.api.getTopGames(pageNumber)


    override fun getTopGames(): LiveData<List<TopGames>> =
        appDatabase.getTopGamesDao().getTopGames()

    override suspend fun insertTop(top: Top): Int =
        appDatabase.getTopDao().insetOrUpdate(top)


    override suspend fun insertGames(game: Game): Int =
        appDatabase.getGameDao().insetOrUpdate(game)


    override suspend fun deleteTop(top: Top) =
        appDatabase.getTopDao().deleteTop(top)


    override suspend fun deleteGame(game: Game) =
        appDatabase.getGameDao().deleteGame(game)
}