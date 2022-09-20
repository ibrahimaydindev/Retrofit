package com.example.retrofit.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.databinding.RecyclerRowBinding
import com.example.retrofit.model.Coin

class RecyclerViewAdapter(private val coinList: ArrayList<Coin>, private val listener: Listener) :
    RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {
    interface Listener {
        fun onItemClick(coin: Coin)
    }
    private val colors: Array<String> = arrayOf(
        "#13bd27",
        "#29c1e1",
        "#b129e1",
        "#d3df13",
        "#f6bd0c",
        "#a1fb93",
        "#0d9de3",
        "#ffe48f"
    )
    class RowHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RowHolder(binding)
    }
    override fun getItemCount(): Int {
        return coinList.count()
    }
    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.itemView.setOnClickListener {
            listener.onItemClick(coinList.get(position))
        }
        holder.itemView.setBackgroundColor(Color.parseColor(colors[position % 8]))
        holder.binding.coinsItemNameTextView.text = coinList.get(position).currency
        holder.binding.coinsItemPriceTextView.text = coinList.get(position).price
    }
}