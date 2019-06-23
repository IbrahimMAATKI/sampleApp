package com.sample.sampleapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Zedney Creative on 23/06/2019.
 */
data class AppImage(
    @SerializedName("id")
    @Expose
    var id: Int,
    @SerializedName("order_id")
    @Expose
    var orderId: Int,
    @SerializedName("image_url")
    @Expose
    var imageUrl: String
)