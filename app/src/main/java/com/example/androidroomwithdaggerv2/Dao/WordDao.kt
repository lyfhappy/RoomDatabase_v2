package com.example.androidroomwithdaggerv2.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.androidroomwithdaggerv2.data.Word
import kotlinx.coroutines.flow.Flow
@Dao
interface WordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addWord(word: Word)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateWord(word: Word)

    @Delete
    fun delete(word: Word)


    @Query("Select *  from word_table order by id ASC")
    fun getAllWords(): Flow<List<Word>>
    /*
            @Query("Select * from 'word_table' where id = :id")
            abstract fun getWordById(id: Int): Flow<Word>

           */
}