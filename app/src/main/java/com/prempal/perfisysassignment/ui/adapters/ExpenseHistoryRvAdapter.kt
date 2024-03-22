package com.prempal.perfisysassignment.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prempal.perfisysassignment.data.ExpenseHistoryResponse
import com.prempal.perfisysassignment.databinding.ItemsExpenseHistoryRvBinding

class ExpenseHistoryRvAdapter(private val items: List<ExpenseHistoryResponse>) :
    RecyclerView.Adapter<ExpenseHistoryRvAdapter.ExpenseHistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseHistoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemsExpenseHistoryRvBinding.inflate(inflater, parent, false)
        return ExpenseHistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExpenseHistoryViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class ExpenseHistoryViewHolder(private val binding: ItemsExpenseHistoryRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ExpenseHistoryResponse) {
            binding.response = item
            binding.executePendingBindings()
        }
    }
}