package com.prempal.perfisysassignment.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.prempal.perfisysassignment.R
import com.prempal.perfisysassignment.data.ExpenseHistoryResponse
import com.prempal.perfisysassignment.databinding.FragmentMarghProfileBinding
import com.prempal.perfisysassignment.databinding.FragmentSplitifyHistoryBinding
import com.prempal.perfisysassignment.databinding.FragmentSplitifyHomeBinding
import com.prempal.perfisysassignment.ui.adapters.ExpenseHistoryRvAdapter

class SplitifyHistoryFragment : Fragment() {

    private lateinit var binding: FragmentSplitifyHistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplitifyHistoryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val expenseHistoryResponse = listOf(
            ExpenseHistoryResponse("22/03/2024 9:39", "onions", "100", "Harry"),
            ExpenseHistoryResponse("22/03/2024 10:39", "oreo", "10", "Amelia"),
            ExpenseHistoryResponse("22/03/2024 10:45", "chocolates", "1000", "Kerr"),
            ExpenseHistoryResponse("22/03/2024 10:55", "bread", "50", "Kerr"),
            ExpenseHistoryResponse("22/03/2024 10:45", "eggs", "100", "Amelia"),
            ExpenseHistoryResponse("22/03/2024 10:45", "taxi", "1500", "Harry"),
            ExpenseHistoryResponse("22/03/2024 11:05", "drink", "100", "Kerr")
        )

        val adapter = ExpenseHistoryRvAdapter(expenseHistoryResponse)
        binding.expenseHistoryRv.adapter = adapter
        binding.expenseHistoryRv.layoutManager = LinearLayoutManager(context)

    }
}