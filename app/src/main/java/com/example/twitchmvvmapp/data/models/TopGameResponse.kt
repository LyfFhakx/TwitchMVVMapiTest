package com.example.twitchmvvmapp.data.models

data class TopGameResponse(
    val _total: Int,
    val top: MutableList<Top>
)