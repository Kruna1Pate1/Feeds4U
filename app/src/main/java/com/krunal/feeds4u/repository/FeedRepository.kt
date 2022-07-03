package com.krunal.feeds4u.repository

import com.krunal.feeds4u.db.ArticleDao
import com.krunal.feeds4u.model.FeedResponse
import com.krunal.feeds4u.network.FeedApiServiceImpl
import retrofit2.Response
import javax.inject.Inject

class FeedRepository @Inject constructor(
    private val feedApiServiceImpl: FeedApiServiceImpl,
    private val articleDao: ArticleDao
) {


    suspend fun getBreakingNews(
        countryCode: String = "in",
        page: Int = 1
    ): Response<FeedResponse> = feedApiServiceImpl.getBreakingNews(countryCode, page)

    suspend fun getBreakingNews(
        category: String,
        countryCode: String = "in",
        page: Int = 1,
    ): Response<FeedResponse> = feedApiServiceImpl.getBreakingNews(category, countryCode, page)
}