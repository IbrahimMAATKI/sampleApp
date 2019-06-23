package com.sample.sampleapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Zedney Creative on 23/06/2019.
 */
data class CardModel(

    @SerializedName("app_id")
    @Expose
    var appId: String,
    @SerializedName("app_package")
    @Expose
    var appPackage: String,
    @SerializedName("email")
    @Expose
    var email: String,
    @SerializedName("website")
    @Expose
    var website: String,
    @SerializedName("privacy_policy_url")
    @Expose
    var privacyPolicyUrl: String,
    @SerializedName("total_downloads")
    @Expose
    var totalDownloads: Int,
    @SerializedName("average_ratings")
    @Expose
    var averageRatings: Int,
    @SerializedName("total_ratings")
    @Expose
    var totalRatings: Int,
    @SerializedName("total_rating_1")
    @Expose
    var totalRating1: Int,
    @SerializedName("total_rating_2")
    @Expose
    var totalRating2: Int,
    @SerializedName("total_rating_3")
    @Expose
    var totalRating3: Int,
    @SerializedName("total_rating_4")
    @Expose
    var totalRating4: Int,
    @SerializedName("total_rating_5")
    @Expose
    var totalRating5: Int,
    @SerializedName("app_version_id")
    @Expose
    var appVersionId: Any,
    @SerializedName("version_code")
    @Expose
    var versionCode: Any,
    @SerializedName("app_size")
    @Expose
    var appSize: Any,
    @SerializedName("last_update")
    @Expose
    var lastUpdate: Any,
    @SerializedName("publisher_name")
    @Expose
    var publisherName: String,
    @SerializedName("name")
    @Expose
    var name: String,
    @SerializedName("short_desc")
    @Expose
    var shortDesc: String,
    @SerializedName("long_desc")
    @Expose
    var longDesc: String,
    @SerializedName("app_icon_url")
    @Expose
    var appIconUrl: String,
    @SerializedName("app_featured_url")
    @Expose
    var appFeaturedUrl: String

)