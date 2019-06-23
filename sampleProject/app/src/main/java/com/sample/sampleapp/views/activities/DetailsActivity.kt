package com.sample.sampleapp.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sample.sampleapp.R
import com.sample.sampleapp.databinding.ActivityDetailsBinding
import com.sample.sampleapp.viewModels.DetailsActivityVM

class DetailsActivity : AppCompatActivity() {

    companion object{
        const val APP_ID = "app_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()
    }

    private fun initDataBinding() {
        val mBinding: ActivityDetailsBinding =
            DataBindingUtil.setContentView(this@DetailsActivity, R.layout.activity_details)
        DetailsActivityVM(this@DetailsActivity, mBinding)
    }


}
