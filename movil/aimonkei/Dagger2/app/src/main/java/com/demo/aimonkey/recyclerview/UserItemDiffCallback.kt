package com.demo.aimonkey.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.demo.aimonkey.SingleDataModel

class UserItemDiffCallback : DiffUtil.ItemCallback<SingleDataModel>() {

    override fun areItemsTheSame
                (oldItem: SingleDataModel, newItem: SingleDataModel): Boolean
            = oldItem.id == newItem.id

    override fun areContentsTheSame
                (oldItem: SingleDataModel, newItem: SingleDataModel): Boolean
            = oldItem == newItem
}