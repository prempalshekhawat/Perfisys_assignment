package com.prempal.perfisysassignment.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prempal.perfisysassignment.data.ExpenseHistoryResponse
import com.prempal.perfisysassignment.data.MarghQuotesResponse
import com.prempal.perfisysassignment.databinding.ItemsExpenseHistoryRvBinding
import com.prempal.perfisysassignment.databinding.ItemsMarghHomeRvBinding

class MarghHomeRvAdapter(private val items: List<MarghQuotesResponse>, private val recyclerView: RecyclerView) :
    RecyclerView.Adapter<MarghHomeRvAdapter.MarghHomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarghHomeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemsMarghHomeRvBinding.inflate(inflater, parent, false)
        return MarghHomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MarghHomeViewHolder, position: Int) {
        holder.bind(items[position])
        Log.d("imageUrlListSize", items.size.toString())
    }

    override fun getItemCount(): Int = items.size

    inner class MarghHomeViewHolder(private val binding: ItemsMarghHomeRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MarghQuotesResponse) {
            binding.response = item
            binding.executePendingBindings()
        }
    }
}