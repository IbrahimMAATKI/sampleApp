package com.sample.sampleapp.viewModels

import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.sample.sampleapp.R
import com.sample.sampleapp.views.activities.adapters.DataListAdapter
import com.sample.sampleapp.databinding.ActivityMainBinding
import com.sample.sampleapp.models.CardModel
import com.sample.sampleapp.network.ApiCalls
import com.sample.sampleapp.utils.Constants
import com.sample.sampleapp.views.activities.MainActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import org.json.JSONObject

/**
 * Created by Zedney Creative on 23/06/2019.
 */
class MainActivityVM(
    var mainActivity: MainActivity,
    var mBinding: ActivityMainBinding
) {
    val disposable: Disposable


    init {
        disposable = ApiCalls(mainActivity).apiInterface.getList(1, 0, 50, Constants.auth).subscribeOn(Schedulers.io())
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

    private fun manageResult(result: List<Any>?) {
        disposable.dispose()
        if ((result != null) && (result.size > 0)) {
            var dataList: ArrayList<CardModel> = ArrayList()

            result!!.forEach {

                val type = object : TypeToken<CardModel>() {}.type
                val ow = ObjectMapper().writer().withDefaultPrettyPrinter()
                val json = ow.writeValueAsString(it)
                val gson = GsonBuilder().setPrettyPrinting().create()
                val jsonObj = JSONObject(json)
                dataList.add(gson.fromJson(jsonObj.toString(), type) as CardModel)

            }


            mBinding.dataRV.adapter = DataListAdapter(mainActivity, dataList)
            mBinding.dataRV.layoutManager = LinearLayoutManager(mainActivity, RecyclerView.VERTICAL, false);

        } else {
            Toast.makeText(mainActivity, mainActivity.getString(R.string.no_results), Toast.LENGTH_SHORT).show()
        }
    }
}