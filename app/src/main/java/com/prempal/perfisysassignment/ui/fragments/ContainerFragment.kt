package com.prempal.perfisysassignment.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.prempal.perfisysassignment.R
import com.prempal.perfisysassignment.databinding.FragmentContainerBinding

class ContainerFragment : Fragment() {

    private lateinit var binding: FragmentContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentContainerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.splitifyHomeButton.setOnClickListener{
            findNavController().navigate(R.id.action_container_fragment_to_splitify_home_fragment)
        }

        binding.splitifyHistoryButton.setOnClickListener{
            findNavController().navigate(R.id.action_container_fragment_to_splitify_history_fragment)
        }

        binding.marghHomeButton.setOnClickListener{
            findNavController().navigate(R.id.action_container_fragment_to_margh_home_fragment)
        }

        binding.marghProfileButton.setOnClickListener{
            findNavController().navigate(R.id.action_container_fragment_to_margh_profile_fragment)
        }

    }
}