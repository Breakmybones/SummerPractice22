package com.voxeldev.summerpractice2022.ui.fragments

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.google.android.material.transition.MaterialContainerTransform
import com.voxeldev.summerpractice2022.R
import com.voxeldev.summerpractice2022.databinding.FragmentDetailsBinding
import com.voxeldev.summerpractice2022.ui.activities.MainActivity

class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)

        val cosmetics = (requireActivity() as MainActivity).cosmetics
        val position = arguments?.getInt("position", -1)

        if (position == null || position == -1) {
            Log.d("Snacks", "Error")
            return binding.root
        }

        Glide.with(requireContext())
            .load(cosmetics[position].url)
            .into(binding.detailsImage)
        binding.detailsName.text = cosmetics[position].name
        binding.detailsDescription.text = cosmetics[position].description
        binding.detailsPrice.text = cosmetics[position].price

        return binding.root
    }

    @SuppressLint("ResourceType")
    override fun setSharedElementEnterTransition(transition: Any?) {
        MaterialContainerTransform().apply {
            drawingViewId = R.id.main_nav_host_fragment
            duration = 1000
            scrimColor = Color.TRANSPARENT
            setAllContainerColors(requireContext().getColor(com.google.android.material.R.attr.colorSurface))
        }
    }
}