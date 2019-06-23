package com.sample.sampleapp.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sample.sampleapp.R
import com.sample.sampleapp.databinding.ActivitySplashBinding
import com.sample.sampleapp.viewModels.SplashAcitivityVM

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()

    }


    private fun initDataBinding() {
        val mBinding: ActivitySplashBinding =
            DataBindingUtil.setContentView(this@SplashActivity, R.layout.activity_splash)
        SplashAcitivityVM(this@SplashActivity, mBinding)

    }

}
