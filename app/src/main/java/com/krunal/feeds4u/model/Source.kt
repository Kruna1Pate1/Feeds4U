package com.krunal.feeds4u.model

import com.google.gson.annotations.SerializedName

data class Source(

    @SerializedName("id")
    val id: String?,

    @SerializedName("name")
    val name: String
)
