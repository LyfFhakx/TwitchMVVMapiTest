package com.example.twitchmvvmapp.domain.Converters

import androidx.room.TypeConverter
import com.example.twitchmvvmapp.data.models.Logo

class LogoConverter {
    @TypeConverter
    fun fromLogoMedium(logo: Logo): String? {
        return logo.medium
    }

    @TypeConverter
    fun fromLogoSmall(logo: Logo): String? {
        return logo.small
    }

    @TypeConverter
    fun fromLogoLarge(logo: Logo): String? {
        return logo.large
    }

    @TypeConverter
    fun fromLogoTemplate(logo: Logo): String? {
        return logo.template
    }

    @TypeConverter
    fun toLogo(medium: String): Logo {
        return Logo("", medium, "", "")
    }
}