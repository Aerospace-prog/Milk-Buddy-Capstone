package com.example.milkbuddy.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.milkbuddy.R
import com.example.milkbuddy.databinding.FragmentHomeBinding
import com.example.milkbuddy.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val homeViewModel: HomeViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        
        binding.vendorRecyclerView.layoutManager = LinearLayoutManager(context)
        val vendorAdapter = VendorAdapter() 
        binding.vendorRecyclerView.adapter = vendorAdapter

        
        homeViewModel.getVendors().observe(viewLifecycleOwner) { vendors ->
            vendorAdapter.submitList(vendors) 
        }

        
        binding.viewAllVendorsButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_vendorListFragment) // Create this action in nav_graph
        }

        return binding.root
    }
}