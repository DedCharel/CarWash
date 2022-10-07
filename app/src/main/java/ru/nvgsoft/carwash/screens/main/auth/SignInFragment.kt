package ru.nvgsoft.carwash.screens.main.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
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
        viewModel.requestCode(
            phone = binding.phoneEditText.text.toString()
        )
    }
}