package com.sample.sampleapp.viewModels

import android.text.method.ScrollingMovementMethod
import android.widget.Toast
import com.denzcoskun.imageslider.models.SlideModel
import com.sample.sampleapp.R
import com.sample.sampleapp.databinding.ActivityDetailsBinding
import com.sample.sampleapp.models.FullDetailsModel
import com.sample.sampleapp.network.ApiCalls
import com.sample.sampleapp.utils.Constants
import com.sample.sampleapp.views.activities.DetailsActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by Zedney Creative on 23/06/2019.
 */
class DetailsActivityVM(
    val detailsActivity: DetailsActivity,
    val mBinding: ActivityDetailsBinding
) {

    val disposable: Disposable

    init {
        val appId = detailsActivity.intent.getStringExtra(DetailsActivity.APP_ID)

        mBinding.longDesc.movementMethod = ScrollingMovementMethod()

        disposable = ApiCalls(detailsActivity).apiInterface.getDetails(
            appId, Constants.auth
        ).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { result ->
                    manageResult(result)

                },
                { error ->
                    error.printStackTrace()
                    manageResult(null)
                }
            )
    }

    private fun manageResult(result: FullDetailsModel?) {
        disposable.dispose()
        if (result != null) {

            mBinding.details = result
            val imageList = ArrayList<SlideModel>()
            result.appImages.forEach {
                imageList.add(SlideModel(it.imageUrl, it.orderId.toString()))
            }
            mBinding.imageSlider.setImageList(imageList)
        } else {
            Toast.makeText(detailsActivity, detailsActivity.getString(R.string.no_results), Toast.LENGTH_SHORT).show()
        }
    }

}