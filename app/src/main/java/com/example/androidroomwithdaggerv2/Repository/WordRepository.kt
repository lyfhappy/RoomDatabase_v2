package com.example.androidroomwithdaggerv2.Repository

import androidx.annotation.WorkerThread
import com.example.androidroomwithdaggerv2.Dao.WordDao
import com.example.androidroomwithdaggerv2.data.Word
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WordRepository @Inject constructor(private val wordDao: WordDao) {
    @WorkerThread
    suspend fun insert(word: Word) = wordDao.addWord(word)
    @WorkerThread
    suspend fun update(word: Word) = wordDao.updateWord(word)
    @WorkerThread
    suspend fun delete(word: Word) = wordDao.delete(word)

    fun getAllWords(): Flow<List<Word>> = wordDao.getAllWords()
    /*
    fun getWordById(id: Int): Flow<Word> = wordDao.getWordById(id)

     */

}