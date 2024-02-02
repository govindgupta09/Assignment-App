package com.govi.appassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.govi.appassignment.databinding.ItemFrameBinding
import com.govi.appassignment.dataModel.FrameItem

class FrameAdapter(private val items: List<FrameItem>) :
    RecyclerView.Adapter<FrameAdapter.FrameViewHolder>() {

    class FrameViewHolder(private val binding: ItemFrameBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: FrameItem) {
            // Bind data to the views
            binding.imgGames.setImageResource(item.gamesImage)
            binding.tvItemGames.text = item.gamesText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrameViewHolder {
        val binding = ItemFrameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FrameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FrameViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = items.size
}
