package com.pedroayon.cryptocurrencyapp.domain.repository

import com.pedroayon.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.pedroayon.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}