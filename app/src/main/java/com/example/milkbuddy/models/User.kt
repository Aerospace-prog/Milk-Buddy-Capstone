package com.example.milkbuddy.models

data class User(
    val userId: String = "",
    val name: String = "",
    val phone: String = "",
    val role: String = "", // "customer" or "vendor"
    val address: String = ""
) 