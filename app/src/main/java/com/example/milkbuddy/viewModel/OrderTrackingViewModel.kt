package com.example.milkbuddy.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.milkbuddy.models.Order
import com.example.milkbuddy.repositories.MilkBuddyRepository
import kotlinx.coroutines.launch

class OrderTrackingViewModel(private val repository: MilkBuddyRepository) : ViewModel() {
    private lateinit var _orders: LiveData<List<Order>>

    fun getUserOrders(): LiveData<List<Order>> {
        viewModelScope.launch {
            _orders = repository.getUserOrders()
        }
        return _orders
    }
}