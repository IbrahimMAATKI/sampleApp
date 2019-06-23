package com.sample.sampleapp.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * Created by Zedney Creative on 23/06/2019.
 */
class CustomDataBinder {

    companion object {
        @BindingAdapter("imgRes")
        @JvmStatic
        fun setResource(view: ImageView, resource: String?) {
            if (resource != null)
                Glide.with(view.context).load(resource).into(view)

        }

    }

}