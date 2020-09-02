package com.example.twitchmvvmapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game")
data class Game(
    @PrimaryKey(autoGenerate = true)
    val _id: Int,
    val box: Box,
    val giantbomb_id: Int,
    val logo: Logo,
    val name: String
)