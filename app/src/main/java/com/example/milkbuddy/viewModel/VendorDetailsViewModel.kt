package com.example.milkbuddy.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.milkbuddy.models.Vendor
import com.example.milkbuddy.repositories.MilkBuddyRepository
import kotlinx.coroutines.launch

class VendorDetailsViewModel(private val repository: MilkBuddyRepository) : ViewModel() {
    private lateinit var _vendor: LiveData<Vendor>

    fun fetchVendorDetails(vendorId: String): LiveData<Vendor> {
        viewModelScope.launch {
            _vendor = repository.getVendor(vendorId) // Implement this in the repository
        }
        return _vendor
    }

    fun placeOrder(vendorId: String, quantity: Double) {
        viewModelScope.launch {
            // order placement business logic pending
        }
    }
}