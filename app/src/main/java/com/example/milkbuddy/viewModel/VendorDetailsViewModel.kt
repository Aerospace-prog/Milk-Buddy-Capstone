package com.example.milkbuddy.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class VendorDetailsViewModel : ViewModel() {
    // Define your data and methods here

    fun fetchVendorDetails(vendorId: String) {
        viewModelScope.launch {
            // Fetch vendor details using repository
        }
    }
}