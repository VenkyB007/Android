package com.application.kickscore

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Adapter(private val items: List<TimeStamp>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var timestamp: TextView = itemView.findViewById(R.id.title)
        var layout: TextView = itemView.findViewById(R.id.mylayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false)
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.timestamp.text = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(
            Date(item.timeStamp)
        )
    }
    override fun getItemCount(): Int {
        return items.size
    }
}