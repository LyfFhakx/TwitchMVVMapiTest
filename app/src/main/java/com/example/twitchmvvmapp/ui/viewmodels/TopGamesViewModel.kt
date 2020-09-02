package com.example.twitchmvvmapp.ui.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.twitchmvvmapp.data.models.TopGameResponse
import com.example.twitchmvvmapp.domain.Repository
import com.example.twitchmvvmapp.util.Resource
import kotlinx.coroutines.launch

class TopGamesViewModel(
    app: Application,
    private val topGamesRepository: Repository
) : AndroidViewModel(app) {
    val topGames: MutableLiveData<Resource<TopGameResponse>> = MutableLiveData()
    var topGamesPage = 1
    var topGamesResponse: TopGameResponse? = null

}