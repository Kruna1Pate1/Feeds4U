package com.krunal.feeds4u.network

import com.krunal.feeds4u.model.FeedResponse
import com.krunal.feeds4u.utils.Constants
import com.krunal.feeds4u.utils.FeedCategory
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FeedApiService {

    @GET("top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String = Constants.API_KEY
    ) : Response<FeedResponse>

    @GET("top-headlines")
    suspend fun getBreakingNews(
        @Query("category")
        category: String,
        @Query("country")
        countryCode: String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String = Constants.API_KEY
    ) : Response<FeedResponse>

//    @GET("everything")
//    suspend fun get
}