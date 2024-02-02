package com.govi.appassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.govi.appassignment.dataModel.BetNowItem
import com.govi.appassignment.databinding.ItemBetNowBinding

class BetNowAdapter(private val items : List<BetNowItem>): RecyclerView.Adapter<BetNowAdapter.BetNowViewHolder>() {
    class BetNowViewHolder(private val binding: ItemBetNowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: BetNowItem) {
            binding.imgFlag1.setImageResource(item.flag1)
            binding.imgFlag2.setImageResource(item.flag2)
            binding.tvEspanyol.text = item.team1
            binding.tvMadrid.text = item.team2
            binding.tvFlag1Score.text = item.score1.toString()
            binding.tvFlag2Score.text = item.score2.toString()
            binding.tvMin.text = item.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BetNowViewHolder {
        val view = ItemBetNowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BetNowViewHolder(view)
    }

    override fun onBindViewHolder(holder: BetNowViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

}