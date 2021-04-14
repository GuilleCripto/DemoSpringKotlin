package com.demo.aimonkey.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.soumyajit.daggermultibindingmvvmsample.R
import com.demo.aimonkey.SingleDataModel

class UsersAdapter : ListAdapter<SingleDataModel, UserViewHolder>(UserItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): UserViewHolder {
        return UserViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_single_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }
}