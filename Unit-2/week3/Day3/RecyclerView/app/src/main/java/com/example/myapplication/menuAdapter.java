package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class menuAdapter extends RecyclerView.Adapter<menuViewHolder> {

    private ArrayList<Menu> menuList;
    public menuAdapter(ArrayList<Menu> menuArrayList){
        menuList = menuArrayList;
    }

    @NonNull
    @Override
    public menuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_layout,parent,false);

        return new menuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull menuViewHolder holder, int position) {
        Menu menu = menuList.get(position);
        holder.setData(menu);


    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }
}
