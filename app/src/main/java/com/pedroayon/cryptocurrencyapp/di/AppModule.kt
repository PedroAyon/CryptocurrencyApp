package com.pedroayon.cryptocurrencyapp.di

import com.pedroayon.cryptocurrencyapp.common.Constants
import com.pedroayon.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.pedroayon.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.pedroayon.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(
        api: CoinPaprikaApi
    ): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}