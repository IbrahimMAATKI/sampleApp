package com.sample.sampleapp

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.sample.sampleapp.utils.ExceptionHandler

/**
 * Created by Zedney Creative on 23/06/2019.
 */
class SampleApp : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        Thread.setDefaultUncaughtExceptionHandler(ExceptionHandler())
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    companion object {
        lateinit var instance: SampleApp
            private set
    }

}