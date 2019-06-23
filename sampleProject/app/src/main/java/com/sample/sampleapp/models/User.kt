package com.sample.sampleapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Zedney Creative on 23/06/2019.
 */
data class User(

    @SerializedName("user_id")
    @Expose
    var userId: String,
    @SerializedName("full_name")
    @Expose
    var fullName: Any,
    @SerializedName("image_url")
    @Expose
    var imageUrl: Any

)