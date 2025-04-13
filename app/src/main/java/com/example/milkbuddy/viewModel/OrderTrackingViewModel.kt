package com.example.milkbuddy.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class OrderTrackingViewModel : ViewModel() {
    // Define your data and methods here

    fun trackOrder(orderId: String) {
        viewModelScope.launch {
            // Track order using repository
        }
    }
}