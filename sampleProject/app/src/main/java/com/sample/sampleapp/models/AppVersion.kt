package com.sample.sampleapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Zedney Creative on 23/06/2019.
 */
data class AppVersion(
    @SerializedName("id")
    @Expose
    var id: Int,
    @SerializedName("total_downloads")
    @Expose
    var totalDownloads: Int,
    @SerializedName("average_ratings")
    @Expose
    var averageRatings: Int,
    @SerializedName("total_ratings")
    @Expose
    var totalRatings: Int,
    @SerializedName("version_name")
    @Expose
    var versionName: String,
    @SerializedName("version_code")
    @Expose
    var versionCode: Int,
    @SerializedName("whats_news_en")
    @Expose
    var whatsNewsEn: String,
    @SerializedName("whats_news_ar")
    @Expose
    var whatsNewsAr: String,
    @SerializedName("app_size")
    @Expose
    var appSize: String,
    @SerializedName("apk_url")
    @Expose
    var apkUrl: String
)