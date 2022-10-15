package ru.nvgsoft.carwash.screens.main.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import ru.nvgsoft.carwash.R
import ru.nvgsoft.carwash.databinding.FragmentSignInCodeBinding


class SignInCodeFragment: Fragment(R.layout.fragment_sign_in_code) {

    val viewModel by viewModels<SignInCodeViewModel>()

    lateinit var binding: FragmentSignInCodeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInCodeBinding.bind(view)

        binding.signInButton.setOnClickListener { onSignInButtonPressed() }
    }

    private fun onSignInButtonPressed() {
        val direction = SignInCodeFragmentDirections.actionSignInCodeFragmentToTabsFragment()
        val navController = findNavController()
        navController.navigate(direction)
    }
}