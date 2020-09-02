package com.example.twitchmvvmapp.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.twitchmvvmapp.data.models.Top

class TopGamesAdapter : RecyclerView.Adapter<TopGamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopGamesViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TopGamesViewHolder, position: Int) {
        val top = differ.currentList[position]
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }


    private val differCallback = object : DiffUtil.ItemCallback<Top>() {
        override fun areContentsTheSame(oldItem: Top, newItem: Top): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areItemsTheSame(oldItem: Top, newItem: Top): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    private var onItemClickListener: ((Top) -> Unit)? = null

    fun setOnCLickListener(listener: (Top) -> Unit) {
        onItemClickListener = listener
    }
}