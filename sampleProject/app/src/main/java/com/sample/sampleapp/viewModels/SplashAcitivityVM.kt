package com.sample.sampleapp.viewModels

import android.content.Intent
import com.sample.sampleapp.databinding.ActivitySplashBinding
import com.sample.sampleapp.views.activities.MainActivity
import com.sample.sampleapp.views.activities.SplashActivity

/**
 * Created by Zedney Creative on 23/06/2019.
 */
class SplashAcitivityVM(
    splashActivity: SplashActivity,
    mBinding: ActivitySplashBinding
) {
    init {

        val intentLauncher: IntentLauncher = IntentLauncher(null, splashActivity)
        intentLauncher.start()

    }


    private class IntentLauncher(target: Runnable?, val mActivity: SplashActivity) : Thread(target) {
        override fun run() {
            try {
                Thread.sleep(2 * 1000)
            } catch (ex: Exception) {
                ex.printStackTrace()
            }

            val intent = Intent(mActivity, MainActivity::class.java)
            mActivity.startActivity(intent)
            mActivity.finish()

        }

    }
}