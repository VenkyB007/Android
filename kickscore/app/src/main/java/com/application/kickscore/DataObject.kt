package com.application.kickscore

object DataObject{
    var items = mutableListOf<TimeStamp>()

    fun setItem(timeStamp: Long){
        items.add(TimeStamp(timeStamp))
    }

    fun getAllItems(): List<TimeStamp>{
        return items
    }
}