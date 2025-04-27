package com.example.milkbuddy.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.milkbuddy.R
import com.example.milkbuddy.databinding.FragmentOrderTrackingBinding
import com.example.milkbuddy.viewModel.OrderTrackingViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class OrderTrackingFragment : Fragment() {
    private lateinit var binding: FragmentOrderTrackingBinding
    private val orderTrackingViewModel: OrderTrackingViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentOrderTrackingBinding.inflate(inflater, container, false)

    
        binding.orderRecyclerView.layoutManager = LinearLayoutManager(context)
        val orderAdapter = OrderAdapter() // Create this adapter to bind order data
        binding.orderRecyclerView.adapter = orderAdapter

       
        orderTrackingViewModel.getUserOrders().observe(viewLifecycleOwner) { orders ->
            orderAdapter.submitList(orders) // Update the RecyclerView with order data
        }

        return binding.root
    }
}