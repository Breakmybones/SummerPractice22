package com.voxeldev.summerpractice2022.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.voxeldev.summerpractice2022.R
import com.voxeldev.summerpractice2022.data.models.Cosmetics
import com.voxeldev.summerpractice2022.databinding.ItemCosmeticsListBinding


class CosmeticsAdapter(
    private val cosmetics: List<Cosmetics>,
    private val navController: NavController
) : RecyclerView.Adapter<CosmeticsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CosmeticsViewHolder {
        val binding = ItemCosmeticsListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return CosmeticsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CosmeticsViewHolder, position: Int) {
        holder.nameTextView.text = cosmetics[position].name
        holder.priceTextView.text = cosmetics[position].price

        holder.root.setOnClickListener {
            navController.navigate(
                R.id.action_navigation_list_to_navigation_details,
                bundleOf("position" to position)
            )
        }
    }

    override fun getItemCount(): Int = cosmetics.size
}