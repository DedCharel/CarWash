package ru.nvgsoft.carwash.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.nvgsoft.carwash.model.accounts.AccountsSource
import ru.nvgsoft.carwash.model.accounts.retrofit.RetrofitAccountsSource

@Module
@InstallIn(SingletonComponent::class)
abstract class SourcesModule {

    @Binds
    abstract fun bindAccountSource(
        retrofitAccountsSource: RetrofitAccountsSource
    ): AccountsSource

}