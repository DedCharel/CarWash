package ru.nvgsoft.carwash.model.accounts

interface AccountsSource {

    suspend fun signIn(phone: String, code: String): String

    suspend fun requestCode(phone: String)

}