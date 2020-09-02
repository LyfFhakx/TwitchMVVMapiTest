package com.example.twitchmvvmapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.twitchmvvmapp.R
import com.example.twitchmvvmapp.data.AppDatabase
import com.example.twitchmvvmapp.data.repository.TopGameRepositoryImpl
import com.example.twitchmvvmapp.ui.viewmodels.TopGamesViewModel
import com.example.twitchmvvmapp.ui.viewmodels.TopGamesViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    lateinit var viewmodel: TopGamesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topGameRepository = TopGameRepositoryImpl(AppDatabase(this))
        val viewModelProviderFactory =
            TopGamesViewModelProviderFactory(application, topGameRepository)
        viewmodel =
            ViewModelProvider(this, viewModelProviderFactory).get(TopGamesViewModel::class.java)
    }
}