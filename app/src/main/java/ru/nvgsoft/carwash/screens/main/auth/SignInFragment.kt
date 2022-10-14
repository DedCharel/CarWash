package ru.nvgsoft.carwash.screens.main.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.nvgsoft.carwash.R
import ru.nvgsoft.carwash.databinding.FragmentSignInBinding

@AndroidEntryPoint
class SignInFragment: Fragment(R.layout.fragment_sign_in) {

    val viewModel by viewModels<SignInViewModel>()
    private lateinit var binding: FragmentSignInBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInBinding.bind(view)
        binding.requestCodeButton.setOnClickListener { onRequestCodeButtonPressed() }
    }

    private fun onRequestCodeButtonPressed() {
        val phone =  binding.phoneEditText.text.toString()
//        viewModel.requestCode(
//            phone = phone
//        )

        val direction = SignInFragmentDirections.actionSignInFragmentToSignInCodeFragment(phone)
        findNavController().navigate(direction)
    }
}