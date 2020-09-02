package com.example.twitchmvvmapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.twitchmvvmapp.R
import com.example.twitchmvvmapp.data.models.Top
import com.example.twitchmvvmapp.data.models.TopGames
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_top_preview.view.*

class TopGamesAdapter : RecyclerView.Adapter<TopGamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopGamesViewHolder {
       return TopGamesViewHolder(
           LayoutInflater.from(parent.context)
               .inflate(R.layout.item_top_preview,parent,false)
       )
    }

    override fun onBindViewHolder(holder: TopGamesViewHolder, position: Int) {
        val topGames = differ.currentList[position]
        holder.itemView.apply{
            Picasso.get().load(topGames.game.logo.medium).into(ivLogo)
            tvTitle.text = topGames.game.name
            tvChannels.text = topGames.top.channels.toString()
            tvViewers.text = topGames.top.viewers.toString()
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }


    private val differCallback = object : DiffUtil.ItemCallback<TopGames>() {
        override fun areContentsTheSame(oldItem: TopGames, newItem: TopGames): Boolean {
            return (oldItem.top.id == newItem.top.id && oldItem.game._id == newItem.game._id)
        }

        override fun areItemsTheSame(oldItem: TopGames, newItem: TopGames): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    private var onItemClickListener: ((TopGames) -> Unit)? = null

    fun setOnCLickListener(listener: (TopGames) -> Unit) {
        onItemClickListener = listener
    }
}