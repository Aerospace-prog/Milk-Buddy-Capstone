package com.example.milkbuddy.di

import com.example.milkbuddy.repositories.MilkBuddyRepository
import com.example.milkbuddy.repositories.MilkBuddyRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    
    @Binds
    @Singleton
    abstract fun bindMilkBuddyRepository(
        milkBuddyRepositoryImpl: MilkBuddyRepositoryImpl
    ): MilkBuddyRepository
} 