package com.example.twitchmvvmapp.data.repository

import androidx.lifecycle.LiveData
import com.example.twitchmvvmapp.data.AppDatabase
import com.example.twitchmvvmapp.data.models.Top
import com.example.twitchmvvmapp.data.models.TopGameResponse
import com.example.twitchmvvmapp.data.net.RetrofitInstance
import com.example.twitchmvvmapp.domain.Repository
import retrofit2.Response

class RepositoryImpl(
    private val appDatabase: AppDatabase
):Repository {
    override suspend fun getTopGames(pageNumber: Int): Response<TopGameResponse> =
      RetrofitInstance.api.getTopGames(pageNumber)


    override fun getTopGames(): LiveData<List<Top>> =
        appDatabase.getTopDao().getTopGames()

    override suspend fun insertOrUpdate(top: Top): Int =
        appDatabase.getTopDao().insertOrUpdate(top)

    override suspend fun delete(top: Top) =
        appDatabase.getTopDao().delete(top)

}