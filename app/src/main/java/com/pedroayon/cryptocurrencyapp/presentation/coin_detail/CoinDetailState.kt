package com.pedroayon.cryptocurrencyapp.presentation.coin_detail

import com.pedroayon.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
