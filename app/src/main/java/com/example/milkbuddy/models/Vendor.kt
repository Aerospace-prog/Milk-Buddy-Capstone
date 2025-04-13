package com.example.milkbuddy.models

data class Vendor(
    val vendorId: String = "",
    val location: String = "",
    val pricePerLitre: Double = 0.0,
    val slots: List<String> = emptyList(),
    val rating: Double = 0.0,
    val name: String = "",
    val phone: String = "",
    val imageUrl: String = ""
) 