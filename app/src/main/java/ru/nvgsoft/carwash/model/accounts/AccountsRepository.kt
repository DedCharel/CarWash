package ru.nvgsoft.carwash.model.accounts

import android.accounts.Account
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AccountsRepository @Inject constructor(
    private val accountsSource: AccountsSource
) {


    suspend fun requestCode(phone: String){
        try {
            accountsSource.requestCode(phone)
        } catch (e:Exception) {

        }

    }

    /**
     * Get the account info of the current signed-in user and listen for all
     * further changes of the account data.
     * If user is not logged-in an empty result is emitted.
     * @return infinite flow, always success; errors are wrapped to [Result]
     */
//    fun getAccount(): Flow<Result<Account>> {
//        return accountLazyFlowSubject.listen(Unit)
//    }

}