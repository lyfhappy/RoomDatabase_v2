package com.example.androidroomwithdaggerv2.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="word_table")
data class Word (
    @PrimaryKey(autoGenerate = true)
    var id:Int= 0,
    @ColumnInfo(name = "Description")
    var description:String = ""
)
