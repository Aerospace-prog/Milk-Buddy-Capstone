package com.example.milkbuddy.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.milkbuddy.databinding.ItemVendorBinding
import com.example.milkbuddy.models.Vendor

class VendorAdapter : ListAdapter<Vendor, VendorAdapter.VendorViewHolder>(VendorDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VendorViewHolder {
        val binding = ItemVendorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VendorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VendorViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class VendorViewHolder(private val binding: ItemVendorBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(vendor: Vendor) {
            binding.vendorName.text = vendor.name
            binding.vendorRating.text = "Rating: ${vendor.rating} ★"
            // Set other vendor details
        }
    }

    class VendorDiffCallback : DiffUtil.ItemCallback<Vendor>() {
        override fun areItemsTheSame(oldItem: Vendor, newItem: Vendor): Boolean {
            return oldItem.vendorId == newItem.vendorId
        }

        override fun areContentsTheSame(oldItem: Vendor, newItem: Vendor): Boolean {
            return oldItem == newItem
        }
    }
}