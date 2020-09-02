package com.example.twitchmvvmapp.data.models

import androidx.room.Entity

@Entity(tableName = "game")
data class Game(
    val _id: Int,
    val box: Box,
    val giantbomb_id: Int,
    val logo: Logo,
    val name: String
)