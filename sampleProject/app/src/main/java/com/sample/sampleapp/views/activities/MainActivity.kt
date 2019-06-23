package com.sample.sampleapp.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sample.sampleapp.R
import com.sample.sampleapp.databinding.ActivityMainBinding
import com.sample.sampleapp.viewModels.MainActivityVM

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()

    }


    private fun initDataBinding() {
        val mBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        MainActivityVM(this@MainActivity, mBinding)

    }

}
