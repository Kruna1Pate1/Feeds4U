package com.krunal.feeds4u.model


import androidx.room.Entity
import com.google.gson.annotations.SerializedName

data class FeedResponse(

    @SerializedName("articles")
    val articles: List<Article>,

    @SerializedName("status")
    val status: String,

    @SerializedName("totalResults")
    val totalResults: Int
)