package com.example.milkbuddy.repositories

import com.example.milkbuddy.models.Order
import com.example.milkbuddy.models.User
import com.example.milkbuddy.models.Vendor

interface MilkBuddyRepository {
    suspend fun createUser(user: User): Result<User>
    suspend fun getUser(userId: String): Result<User>
    suspend fun getVendors(): Result<List<Vendor>>
    suspend fun getVendor(vendorId: String): Result<Vendor>
    suspend fun createOrder(order: Order): Result<Order>
    suspend fun getOrder(orderId: String): Result<Order>
    suspend fun getUserOrders(userId: String): Result<List<Order>>
    suspend fun getVendorOrders(vendorId: String): Result<List<Order>>
    suspend fun updateOrderStatus(orderId: String, status: String): Result<Order>
} 