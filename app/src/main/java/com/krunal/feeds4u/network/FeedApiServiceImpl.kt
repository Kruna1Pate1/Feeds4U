package com.krunal.feeds4u.network

import com.krunal.feeds4u.model.FeedResponse
import retrofit2.Response
import retrofit2.http.Query
import javax.inject.Inject

class FeedApiServiceImpl @Inject constructor(
    private val feedApiService: FeedApiService
) {

    suspend fun getBreakingNews(
        countryCode: String,
        page: Int,
    ): Response<FeedResponse> = feedApiService.getBreakingNews(countryCode, page)

    suspend fun getBreakingNews(
        category: String,
        countryCode: String,
        page: Int
    ): Response<FeedResponse> = feedApiService.getBreakingNews(category, countryCode, page)


}