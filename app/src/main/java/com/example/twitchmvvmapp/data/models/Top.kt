package com.example.twitchmvvmapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "top")
data class Top(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val channels: Int,
    val gameId: Int,
    val viewers: Int
)