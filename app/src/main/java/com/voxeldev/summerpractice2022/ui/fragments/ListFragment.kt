package com.voxeldev.summerpractice2022.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.voxeldev.summerpractice2022.databinding.FragmentListBinding
import com.voxeldev.summerpractice2022.ui.activities.MainActivity
import com.voxeldev.summerpractice2022.ui.adapters.CosmeticsAdapter

class ListFragment : BaseFragment<FragmentListBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)

        val cosmetics = (requireActivity() as MainActivity).cosmetics

        binding.listSnacks.adapter = CosmeticsAdapter(cosmetics, findNavController())

        return binding.root
    }
}