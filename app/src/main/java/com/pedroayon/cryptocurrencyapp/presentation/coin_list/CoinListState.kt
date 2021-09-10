package com.pedroayon.cryptocurrencyapp.presentation.coin_list

import com.pedroayon.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
