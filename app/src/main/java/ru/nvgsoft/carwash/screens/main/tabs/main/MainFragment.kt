package ru.nvgsoft.carwash.screens.main.tabs.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.nvgsoft.carwash.R
import ru.nvgsoft.carwash.databinding.ActivityMainBinding
import ru.nvgsoft.carwash.databinding.FragmentMainBinding

class MainFragment:Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)


        binding.openMapButton.setOnClickListener { openMapButtonPressed() }
    }

    private fun openMapButtonPressed() {

        findNavController().navigate(R.id.mapFragment)

    }
}