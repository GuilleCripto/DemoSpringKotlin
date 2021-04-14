package com.demo.aimonkey.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.soumyajit.daggermultibindingmvvmsample.R
import com.demo.aimonkey.SingleDataModel
import kotlinx.android.synthetic.main.layout_single_item.view.*

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    
    fun bindTo(user: SingleDataModel){
        itemView.name.text = user.first_name
        Glide
            .with(itemView)
            .load(user.avatar)
            .centerCrop()
            .placeholder(R.drawable.user_avatar)
            .into(itemView.image);
    }
}