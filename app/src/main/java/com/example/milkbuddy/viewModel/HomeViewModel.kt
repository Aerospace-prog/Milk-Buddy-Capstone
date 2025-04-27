package com.example.milkbuddy.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.milkbuddy.models.Vendor
import com.example.milkbuddy.repositories.MilkBuddyRepository
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: MilkBuddyRepository) : ViewModel() {
    private val _vendors: LiveData<List<Vendor>> = repository.getVendors() 
    val vendors: LiveData<List<Vendor>> get() = _vendors

    fun getVendors() {
        viewModelScope.launch {
            repository.fetchVendors() // Implement this method to fetch vendors
        }
    }
}