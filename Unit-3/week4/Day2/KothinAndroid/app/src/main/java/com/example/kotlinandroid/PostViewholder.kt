package com.example.kotlinandroid

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class PostViewholder(private val view : View) : RecyclerView.ViewHolder(view) {

    fun setData(responseDTOItem: ResponseDTOItem){
       view.apply {
           tvName.text = responseDTOItem.name
           tvBody.text = responseDTOItem.body
           tvEmail.text = responseDTOItem.email
       }
    }
}