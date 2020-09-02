package com.example.twitchmvvmapp.data.models

import androidx.room.Embedded
import androidx.room.Relation

data class TopGames(
    @Embedded val top:Top,
    @Relation(
        parentColumn = "gameId",
        entityColumn = "_id"
    )
    val game:Game
)