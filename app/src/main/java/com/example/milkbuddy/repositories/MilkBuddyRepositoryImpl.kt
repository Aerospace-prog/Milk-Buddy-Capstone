package com.example.milkbuddy.repositories

import com.example.milkbuddy.models.Order
import com.example.milkbuddy.models.User
import com.example.milkbuddy.models.Vendor
import com.example.milkbuddy.network.MilkBuddyApi
import javax.inject.Inject

class MilkBuddyRepositoryImpl @Inject constructor(
    private val api: MilkBuddyApi
) : MilkBuddyRepository {
    
    override suspend fun createUser(user: User): Result<User> {
        return try {
            val response = api.createUser(user)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to create user: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getUser(userId: String): Result<User> {
        return try {
            val response = api.getUser(userId)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to get user: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getVendors(): Result<List<Vendor>> {
        return try {
            val response = api.getVendors()
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to get vendors: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getVendor(vendorId: String): Result<Vendor> {
        return try {
            val response = api.getVendor(vendorId)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to get vendor: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun createOrder(order: Order): Result<Order> {
        return try {
            val response = api.createOrder(order)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to create order: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getOrder(orderId: String): Result<Order> {
        return try {
            val response = api.getOrder(orderId)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to get order: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getUserOrders(userId: String): Result<List<Order>> {
        return try {
            val response = api.getUserOrders(userId)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to get user orders: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getVendorOrders(vendorId: String): Result<List<Order>> {
        return try {
            val response = api.getVendorOrders(vendorId)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to get vendor orders: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun updateOrderStatus(orderId: String, status: String): Result<Order> {
        return try {
            val response = api.updateOrderStatus(orderId, mapOf("status" to status))
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Failed to update order status: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
} 