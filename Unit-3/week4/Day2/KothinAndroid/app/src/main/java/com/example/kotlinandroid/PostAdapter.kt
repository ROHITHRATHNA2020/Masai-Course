package com.example.kotlinandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val responseList:List<ResponseDTO>) : RecyclerView.Adapter<PostViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewholder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false);
        return PostViewholder(view)
    }

    override fun onBindViewHolder(holder: PostViewholder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return responseList.size
    }
}