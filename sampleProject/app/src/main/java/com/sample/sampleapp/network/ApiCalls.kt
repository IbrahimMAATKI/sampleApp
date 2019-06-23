package com.sample.sampleapp.network
import android.content.Context

/**
 * Created by Zedney Creative on 18/02/2019.
 */
class ApiCalls(context: Context) {
    var apiInterface: APIInterface = ApiClient().getClient(context).create(APIInterface::class.java)
}