package com.example.androidroomwithdaggerv2.di

import android.content.Context
import androidx.room.Room
import com.example.androidroomwithdaggerv2.Dao.WordDao
import com.example.androidroomwithdaggerv2.Database.WordDatabase
import com.example.androidroomwithdaggerv2.Repository.WordRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Provides
    @Singleton
    fun provideWordDatabase(@ApplicationContext context: Context): WordDatabase {
        return Room.databaseBuilder(
            context,
            WordDatabase::class.java,
            "word_database_v1"
        )
            .build()
    }

    @Provides
    fun provideWordDao(wordDatabase: WordDatabase): WordDao {
        return wordDatabase.worddao()

    }

    @Provides
    fun provideWordRepository(wordDao: WordDao): WordRepository {
        return WordRepository(wordDao)
    }
}