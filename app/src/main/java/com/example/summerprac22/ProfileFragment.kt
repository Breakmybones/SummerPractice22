package com.example.summerprac22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerprac22.databinding.FragmentMusicBinding
import com.example.summerprac22.databinding.FragmentProfileBinding

class ProfileFragment: Fragment(R.layout.fragment_profile) {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)

        with(binding) {
            btnResultProfile.setOnClickListener {
                val bundle = Bundle()
                val text = "ProfileFragment"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )
                findNavController().navigate(
                    R.id.action_profileFragment_to_resultFragment,
                    bundle,
                )
            }

        }
    }
}