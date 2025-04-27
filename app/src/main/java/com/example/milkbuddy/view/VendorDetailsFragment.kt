package com.example.milkbuddy.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.milkbuddy.R
import com.example.milkbuddy.databinding.FragmentVendorDetailsBinding
import com.example.milkbuddy.viewModel.VendorDetailsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class VendorDetailsFragment : Fragment() {
    private lateinit var binding: FragmentVendorDetailsBinding
    private val vendorDetailsViewModel: VendorDetailsViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentVendorDetailsBinding.inflate(inflater, container, false)

        
        val vendorId = arguments?.getString("vendorId") 
        vendorDetailsViewModel.fetchVendorDetails(vendorId).observe(viewLifecycleOwner) { vendor ->
            
            binding.vendorName.text = vendor.name
            binding.vendorRating.text = "Rating: ${vendor.rating} ★"
            binding.vendorDescription.text = vendor.description
            binding.vendorPrice.text = "Price per Litre: ₹${vendor.pricePerLitre}"
        }

        
        binding.placeOrderButton.setOnClickListener {
            val quantity = binding.orderQuantity.text.toString().toDouble()
            vendorDetailsViewModel.placeOrder(vendorId, quantity) // Implement this method in ViewModel
        }

        return binding.root
    }
}