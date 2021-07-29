package com.example.itemsclickswe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private ArrayList<StudentModel> studentModelList;
    private ItemClickListener itemClickListener;


    public StudentAdapter(ArrayList<StudentModel> studentModelList, ItemClickListener itemClickListener) {
        this.studentModelList = studentModelList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        StudentModel studentModel = studentModelList.get(position);
       holder.setData(studentModel);
    }

    @Override
    public int getItemCount() {
        return studentModelList.size();
    }
}
