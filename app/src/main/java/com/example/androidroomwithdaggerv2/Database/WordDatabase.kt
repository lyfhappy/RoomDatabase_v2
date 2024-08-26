package com.example.androidroomwithdaggerv2.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidroomwithdaggerv2.Dao.WordDao
import com.example.androidroomwithdaggerv2.data.Word

@Database(entities = [Word::class], version = 1, exportSchema = false)
abstract class WordDatabase: RoomDatabase() {
    abstract fun worddao(): WordDao

}