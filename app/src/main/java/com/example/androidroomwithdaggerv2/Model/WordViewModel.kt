package com.example.androidroomwithdaggerv2.Model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidroomwithdaggerv2.Repository.WordRepository
import com.example.androidroomwithdaggerv2.data.Word
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WordViewModel @Inject constructor(private val wordRepository: WordRepository): ViewModel() {
    //  lateinit var getAllWords: Flow<List<Word>>
    /*
        init {
            viewModelScope.launch {
                getAllWords = wordRepository.getAllWords()
            }
        }

    */
    fun insert(word: Word) {
        viewModelScope.launch(Dispatchers.IO) {
            wordRepository.insert(word)
        }
    }

    fun update(word: Word) {
        viewModelScope.launch() {
            wordRepository.update(word)
        }
    }

    fun delete(word: Word) {
        viewModelScope.launch() {
            wordRepository.delete(word)
        }
    }

    fun getAllStudents(): Flow<List<Word>> {
        return wordRepository.getAllWords()
    }
    /*
        fun getStudentsbyid(id: Int): Flow<Word> {
            return wordRepository.getWordById(id)
        }

     */
}