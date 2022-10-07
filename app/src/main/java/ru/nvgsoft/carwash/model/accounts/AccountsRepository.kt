package ru.nvgsoft.carwash.model.accounts

import javax.inject.Singleton

@Singleton
class AccountsRepository(
    private val accountsSource: AccountsSource
) {
    suspend fun requestCode(phone: String){
        try {
            accountsSource.requestCode(phone)
        } catch (e:Exception) {

        }

    }

}