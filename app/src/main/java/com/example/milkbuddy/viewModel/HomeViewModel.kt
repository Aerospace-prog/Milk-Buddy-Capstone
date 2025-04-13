package com.example.milkbuddy.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    // Define your data and methods here

    fun fetchData() {
        viewModelScope.launch {
            // Fetch data using repository
        }
    }
}