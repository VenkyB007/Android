package com.application.kickscore

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private val itemList = mutableListOf<TimeStamp>()
    private lateinit var adapter: Adapter
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_main_screen)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val add: Button = findViewById(R.id.add)

        adapter = Adapter(itemList)
        recyclerView.adapter= adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        add.setOnClickListener{
            val currentTimeMillis = System.currentTimeMillis()
            val newItem = TimeStamp(currentTimeMillis)
            itemList.add(newItem)
            adapter.notifyDataSetChanged()
        }

    }
}