package com.sample.sampleapp.network

import com.sample.sampleapp.BuildConfig
import com.sample.sampleapp.models.FullDetailsModel
import io.reactivex.Observable
import retrofit2.http.*

/**
 * Created by Zedney Creative on 18/02/2019.
 */

interface APIInterface {

    @GET(BuildConfig.URL_API)
    fun getList(
        @Query("category_id") category_id: Int,
        @Query("page_number") page_number: Int,
        @Query("page_size") page_size: Int,
        @Header("Authorization") auth: String
    ): Observable<List<Any>?>

    @GET(BuildConfig.URL_API + "{app_id}")
    fun getDetails(
        @Path(value = "app_id", encoded = true) appId: String,
        @Header("Authorization") auth: String
    ): Observable<FullDetailsModel>
}