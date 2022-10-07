package ru.nvgsoft.carwash.model.accounts.retrofit

import ru.nvgsoft.carwash.model.accounts.AccountsSource
import javax.inject.Singleton

@Singleton
class RetrofitAccountsSource: AccountsSource {
    override suspend fun signIn(phone: String, code: String): String {
        TODO("Not yet implemented")
    }

    override suspend fun requestCode(phone: String) {
        TODO("Not yet implemented")
    }
}