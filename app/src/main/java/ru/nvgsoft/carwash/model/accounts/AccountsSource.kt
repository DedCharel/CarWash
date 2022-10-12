package ru.nvgsoft.carwash.model.accounts

import android.accounts.Account

interface AccountsSource {

    suspend fun signIn(phone: String, code: String): String

    suspend fun requestCode(phone: String)

    suspend fun getAccount(): Account

}