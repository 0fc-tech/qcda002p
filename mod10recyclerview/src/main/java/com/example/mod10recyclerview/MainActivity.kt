package com.example.mod10recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvBeer = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = BeerAdapter(mutableListOf(
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
            Beer("Brewdog Classic","Meilleure bière",5.5f,"UK","malt"),
        ))
        rvBeer.layoutManager = LinearLayoutManager(this)
        rvBeer.adapter = adapter
    }
}