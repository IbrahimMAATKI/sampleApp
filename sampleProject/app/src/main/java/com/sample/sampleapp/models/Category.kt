package com.sample.sampleapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Zedney Creative on 23/06/2019.
 */
data class Category(
    @SerializedName("category_id")
    @Expose
    var categoryId: Integer,
    @SerializedName("parent_category_id")
    @Expose
    var parentCategoryId: Any,
    @SerializedName("sort_id")
    @Expose
    var sortId: Int,
    @SerializedName("category_name")
    @Expose
    var categoryName: String,
    @SerializedName("image_url")
    @Expose
    var imageUrl: Any
)