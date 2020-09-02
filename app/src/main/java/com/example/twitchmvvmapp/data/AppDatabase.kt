package com.example.twitchmvvmapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.twitchmvvmapp.data.dao.GameDao
import com.example.twitchmvvmapp.data.dao.TopDao
import com.example.twitchmvvmapp.domain.Converters.BoxConverter
import com.example.twitchmvvmapp.domain.Converters.LogoConverter
import com.example.twitchmvvmapp.data.dao.TopGamesDao
import com.example.twitchmvvmapp.data.models.Game
import com.example.twitchmvvmapp.data.models.Top

@Database(
    entities = [Game::class, Top::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(BoxConverter::class, LogoConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getTopDao(): TopDao
    abstract fun getGameDao():GameDao
    abstract fun getTopGamesDao():TopGamesDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "app_db.db"
            )
                .fallbackToDestructiveMigration()
                .build()
    }
}