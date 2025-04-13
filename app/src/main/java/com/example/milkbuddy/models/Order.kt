package com.example.milkbuddy.models

data class Order(
    val orderId: String = "",
    val userId: String = "",
    val vendorId: String = "",
    val quantity: Double = 0.0,
    val status: String = "", // "pending", "confirmed", "dispatched", "delivered"
    val slotTime: String = "",
    val orderDate: String = "",
    val totalAmount: Double = 0.0,
    val paymentMethod: String = "" // "COD", "UPI", etc.
) 