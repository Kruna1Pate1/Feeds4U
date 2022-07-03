package com.krunal.feeds4u.ui.home

import com.krunal.feeds4u.model.FeedResponse
import com.krunal.feeds4u.utils.Resource
import com.krunal.feeds4u.utils.Status

data class FeedUiState(
    val status: Status,
//    val isLoading: Boolean = true,
    val feeds: FeedResponse? = null,
    val error: String? = null
)