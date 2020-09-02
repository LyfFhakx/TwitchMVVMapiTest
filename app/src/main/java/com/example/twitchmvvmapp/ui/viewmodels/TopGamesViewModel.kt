package com.example.twitchmvvmapp.ui.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.twitchmvvmapp.data.models.TopGameResponse
import com.example.twitchmvvmapp.domain.TopGameRepository
import com.example.twitchmvvmapp.util.Resource

class TopGamesViewModel(
    app: Application,
    private val topGamesTopGameRepository: TopGameRepository
) : AndroidViewModel(app) {
    val topGames: MutableLiveData<Resource<TopGameResponse>> = MutableLiveData()
    var topGamesPage = 1
    var topGamesResponse: TopGameResponse? = null

}