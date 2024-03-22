package com.prempal.perfisysassignment.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.prempal.perfisysassignment.R
import com.prempal.perfisysassignment.data.MarghQuotesResponse
import com.prempal.perfisysassignment.databinding.FragmentContainerBinding
import com.prempal.perfisysassignment.databinding.FragmentMarghHomeBinding
import com.prempal.perfisysassignment.ui.adapters.ExpenseHistoryRvAdapter
import com.prempal.perfisysassignment.ui.adapters.MarghHomeRvAdapter

class MarghHomeFragment : Fragment() {

    private lateinit var binding: FragmentMarghHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMarghHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val marghQuotesResponse = listOf(
            MarghQuotesResponse("https://picsum.photos/id/237/200/300"),
            MarghQuotesResponse("https://picsum.photos/200/300?grayscale"),
            MarghQuotesResponse("https://picsum.photos/seed/picsum/200/300"),
            MarghQuotesResponse("https://picsum.photos/200/300/?blur"),
            MarghQuotesResponse("https://picsum.photos/id/870/200/300?grayscale&blur=2"),
        )

        val adapter = MarghHomeRvAdapter(marghQuotesResponse, binding.marghHomeRv)
        binding.marghHomeRv.adapter = adapter
        val snapHelper: SnapHelper = PagerSnapHelper()
        binding.marghHomeRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        snapHelper.attachToRecyclerView(binding.marghHomeRv)

    }


}