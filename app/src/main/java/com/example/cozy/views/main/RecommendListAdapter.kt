package com.example.cozy.views.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cozy.R

class RecommendListAdapter(private val context : Context, val itemClick: (RecommendListData, View) -> Unit) : RecyclerView.Adapter<RecommendListVH>() {
    var datas = mutableListOf<RecommendListData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendListVH {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recommend,parent,false)
        return RecommendListVH(view, itemClick)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecommendListVH, position: Int) {
        holder.bind(datas[position])
    }

    fun addItem(item : RecommendListData){
        datas.add(item)
    }
}