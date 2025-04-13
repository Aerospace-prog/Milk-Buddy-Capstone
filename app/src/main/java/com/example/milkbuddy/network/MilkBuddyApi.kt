package com.example.milkbuddy.network

import com.example.milkbuddy.models.Order
import com.example.milkbuddy.models.User
import com.example.milkbuddy.models.Vendor
import retrofit2.Response
import retrofit2.http.*

interface MilkBuddyApi {
    // User endpoints
    @POST("users")
    suspend fun createUser(@Body user: User): Response<User>
    
    @GET("users/{userId}")
    suspend fun getUser(@Path("userId") userId: String): Response<User>
    
    // Vendor endpoints
    @GET("vendors")
    suspend fun getVendors(): Response<List<Vendor>>
    
    @GET("vendors/{vendorId}")
    suspend fun getVendor(@Path("vendorId") vendorId: String): Response<Vendor>
    
    // Order endpoints
    @POST("orders")
    suspend fun createOrder(@Body order: Order): Response<Order>
    
    @GET("orders/{orderId}")
    suspend fun getOrder(@Path("orderId") orderId: String): Response<Order>
    
    @GET("orders/user/{userId}")
    suspend fun getUserOrders(@Path("userId") userId: String): Response<List<Order>>
    
    @GET("orders/vendor/{vendorId}")
    suspend fun getVendorOrders(@Path("vendorId") vendorId: String): Response<List<Order>>
    
    @PUT("orders/{orderId}/status")
    suspend fun updateOrderStatus(
        @Path("orderId") orderId: String,
        @Body status: Map<String, String>
    ): Response<Order>
} 