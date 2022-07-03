package com.voxeldev.summerpractice2022.ui.adapters

import androidx.recyclerview.widget.RecyclerView
import com.voxeldev.summerpractice2022.databinding.ItemCosmeticsListBinding

class CosmeticsViewHolder(binding: ItemCosmeticsListBinding) : RecyclerView.ViewHolder(binding.root) {
    val root = binding.root
    val nameTextView = binding.snackName
    val priceTextView = binding.snackPrice
}