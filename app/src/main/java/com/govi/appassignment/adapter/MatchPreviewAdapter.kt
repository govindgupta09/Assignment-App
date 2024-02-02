package com.govi.appassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.govi.appassignment.R
import com.govi.appassignment.dataModel.MatchPreviewItem

class MatchPreviewAdapter(private val matchList: List<MatchPreviewItem>) :
    RecyclerView.Adapter<MatchPreviewAdapter.MatchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_match_preview, parent, false)
        return MatchViewHolder(view)
    }

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        val currentItem = matchList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return matchList.size
    }

    class MatchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val team1NameTextView: TextView = itemView.findViewById(R.id.tv_match_preview_name1)
        private val team2NameTextView: TextView = itemView.findViewById(R.id.tv_match_preview_name2)
        private val vsTextView: TextView = itemView.findViewById(R.id.tv_match_preview_vs)
        private val timeTextView: TextView = itemView.findViewById(R.id.tv_time)

        fun bind(matchItem: MatchPreviewItem) {
            team1NameTextView.text = matchItem.team1Name
            team2NameTextView.text = matchItem.team2Name
            // Bind other fields if needed
        }
    }
}
