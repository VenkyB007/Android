package com.application.kickscore

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game_Board")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String,
    var priority:String
)