package ru.nvgsoft.carwash.model.accounts.retrofit

import android.accounts.Account
import ru.nvgsoft.carwash.model.accounts.AccountsSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitAccountsSource @Inject constructor(): AccountsSource {
    override suspend fun signIn(phone: String, code: String): String {
        TODO("Not yet implemented")
    }

    override suspend fun requestCode(phone: String) {
        TODO("Not yet implemented")
    }

    override suspend fun getAccount(): Account {
        TODO("Not yet implemented")
    }
}