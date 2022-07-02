package com.example.summerprac22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerprac22.databinding.FragmentMainBinding
import com.example.summerprac22.databinding.FragmentMessagesBinding

class MessagesFragment : Fragment(R.layout.fragment_messages){

    private var _binding: FragmentMessagesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMessagesBinding.bind(view)


        with(binding) {
            btnResultMessages.setOnClickListener {
                val bundle = Bundle()
                val text = "MessagesFragment"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )
                findNavController().navigate(
                    R.id.action_messagesFragment_to_resultFragment,
                    bundle,
                )
            }

        }
    }
}