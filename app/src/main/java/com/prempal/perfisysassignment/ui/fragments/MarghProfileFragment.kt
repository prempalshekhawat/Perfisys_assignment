package com.prempal.perfisysassignment.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.prempal.perfisysassignment.R
import com.prempal.perfisysassignment.databinding.FragmentMarghProfileBinding

class MarghProfileFragment : Fragment() {

    private lateinit var binding: FragmentMarghProfileBinding
    lateinit var adRequest: AdRequest

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMarghProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context?.let { MobileAds.initialize(it) }
        adRequest = AdRequest.Builder().build()
        binding.profileAdView.loadAd(adRequest)

    }
}