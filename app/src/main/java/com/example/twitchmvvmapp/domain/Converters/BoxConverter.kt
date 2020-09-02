package com.example.twitchmvvmapp.domain.Converters

import androidx.room.TypeConverter
import com.example.twitchmvvmapp.data.models.Box

class BoxConverter {

    @TypeConverter
    fun fromBoxSmall(box: Box): String? {
        return box.small
    }

    @TypeConverter
    fun fromBoxMedium(box: Box): String? {
        return box.medium
    }

    @TypeConverter
    fun fromBoxLarge(box: Box): String? {
        return box.large
    }

    @TypeConverter
    fun fromBoxTemplate(box: Box): String? {
        return box.template
    }

    @TypeConverter
    fun toBox(medium: String): Box {
        return Box("", medium, "", "")
    }

}