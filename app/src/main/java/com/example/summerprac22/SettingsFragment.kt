package com.example.summerprac22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerprac22.databinding.FragmentMusicBinding
import com.example.summerprac22.databinding.FragmentSettingsBinding

class SettingsFragment :Fragment(R.layout.fragment_settings) {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)

        with(binding) {
            btnResultSetting.setOnClickListener {
                val bundle = Bundle()
                val text = "SettingsFragment"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )
                findNavController().navigate(
                    R.id.action_settingsFragment_to_resultFragment,
                    bundle,
                )
            }

        }
    }
}