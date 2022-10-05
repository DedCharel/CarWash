package ru.nvgsoft.carwash.screens.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ru.nvgsoft.carwash.utils.MutableLiveEvent
import ru.nvgsoft.carwash.utils.publishEvent
import ru.nvgsoft.carwash.utils.share


class SplashViewModel: ViewModel() {
    private val _launchMainScreenEvent = MutableLiveEvent<Boolean>()
    val launchMainScreenEvent = _launchMainScreenEvent.share()

    init {
        viewModelScope.launch {
            _launchMainScreenEvent.publishEvent(true)
        }
    }
}