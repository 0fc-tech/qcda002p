package com.example.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10recyclerview.databinding.TemplateBeerBinding

class BeerAdapter(val listBeers : MutableList<Beer>): Adapter<BeerAdapter.BeerVH>() {
    class BeerVH(val binding : TemplateBeerBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeerVH {
        val binding = TemplateBeerBinding.inflate(
            LayoutInflater.from(parent.context),parent,false)
        return BeerVH(binding)
    }

    override fun getItemCount(): Int = listBeers.size

    override fun onBindViewHolder(holder: BeerVH, position: Int) {
        holder.binding.beer = listBeers[position]
    }
}