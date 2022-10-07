package ru.nvgsoft.carwash.screens.main.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.nvgsoft.carwash.model.accounts.AccountsRepository
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
   val accountsRepository: AccountsRepository
): ViewModel() {

    fun requestCode(phone: String) = viewModelScope.launch{
        try {
            accountsRepository.requestCode(phone)
        } catch (e:Exception) {

        }
    }
}