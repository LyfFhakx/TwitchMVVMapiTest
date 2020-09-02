package com.example.twitchmvvmapp.data.net.api

import com.example.twitchmvvmapp.data.models.TopGameResponse
import com.example.twitchmvvmapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface api {


    @GET("/kraken/games/top")
    suspend fun getTopGames(
        @Query("page")
        pageNumber:Int =1,
        @Query("Client-ID")
        apiKey:String = API_KEY
    ): Response<TopGameResponse>

}