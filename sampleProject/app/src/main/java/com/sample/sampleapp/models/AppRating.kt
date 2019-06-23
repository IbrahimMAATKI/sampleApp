package com.sample.sampleapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Zedney Creative on 23/06/2019.
 */
data class AppRating(
    @SerializedName("id")
    @Expose
    var id: Int,
    @SerializedName("app_version_id")
    @Expose
    var appVersionId: Int,
    @SerializedName("rating")
    @Expose
    var rating: Int,
    @SerializedName("comments")
    @Expose
    var comments: String,
    @SerializedName("created_at")
    @Expose
    var createdAt: String,
    @SerializedName("user")
    @Expose
    var user: User
)
