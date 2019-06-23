package com.sample.sampleapp.views.activities.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.sample.sampleapp.R
import com.sample.sampleapp.databinding.CardItemBinding
import com.sample.sampleapp.models.CardModel
import com.sample.sampleapp.views.activities.DetailsActivity
import com.sample.sampleapp.views.activities.MainActivity

/**
 * Created by Zedney Creative on 23/06/2019.
 */
class DataListAdapter(var context: Context, var data: List<CardModel>) :
    RecyclerView.Adapter<DataListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mBinding: CardItemBinding =
            DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.card_item, null, false);
        return ViewHolder(mBinding)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position]);
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra(DetailsActivity.APP_ID, data[position].appId.toString())
            context.startActivity(intent)
        }

    }


    class ViewHolder(var binding: CardItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(obj: CardModel) {
            binding.cardModel = obj
            binding.executePendingBindings()
        }
    }

}