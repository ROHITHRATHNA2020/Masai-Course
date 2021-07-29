package com.example.itemsclickswe;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private ImageView mtvstudentImage;
    private TextView mtvName;
    private TextView mtvAge;
    private TextView mtvDob;
    private TextView mtvAddress;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;

    public StudentViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvstudentImage = itemView.findViewById(R.id.ivStudentImg);
        mtvName = itemView.findViewById(R.id.tvName);
        mtvAge = itemView.findViewById(R.id.tvAge);
        mtvDob= itemView.findViewById(R.id.tvDob);
        mtvAddress = itemView.findViewById(R.id.tvAddress);
        relativeLayout = itemView.findViewById(R.id.relative);
    }

    public void setData(StudentModel studentModel){
        mtvstudentImage.setImageResource(studentModel.getImageId());
        mtvName.setText(studentModel.getName());
        mtvAge.setText(studentModel.getAge()+"");
        mtvAddress.setText(studentModel.getAddress());
        mtvDob.setText(studentModel.getDOB());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.ItemClicked(studentModel,getAdapterPosition());

            }
        });

    }
}
