package com.example.twitchmvvmapp.domain

import androidx.lifecycle.LiveData
import com.example.twitchmvvmapp.data.models.Top
import com.example.twitchmvvmapp.data.models.TopGameResponse
import retrofit2.Response

interface Repository {
    suspend fun getTopGames(pageNumber:Int):Response<TopGameResponse>

    suspend fun insertOrUpdate(top: Top):Int

    fun getTopGames():LiveData<List<Top>>

    suspend fun delete(top:Top)
}