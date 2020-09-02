package com.example.twitchmvvmapp.ui.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.twitchmvvmapp.domain.TopGameRepository

class TopGamesViewModelProviderFactory(
    val app: Application,
    private val topGamesTopGameRepository: TopGameRepository
):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TopGamesViewModel(app,topGamesTopGameRepository) as T
    }
}