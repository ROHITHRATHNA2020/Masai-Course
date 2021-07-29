package com.example.notifyadapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeViewHolder  extends RecyclerView.ViewHolder {
    private TextView mtvName;
    private TextView mtvAge;
    private TextView mtvAddress;
    private ImageView mtvEdit;
    private Button mbtnDone;
    private ItemClickListener itemClickListener;



    public EmployeeViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initData(itemView);
    }

    private void initData(View itemView) {
        mtvAddress = itemView.findViewById(R.id.tvAddress);
        mtvAge = itemView.findViewById(R.id.tvAge);
        mtvName = itemView.findViewById(R.id.tvName);
        mtvEdit = itemView.findViewById(R.id.ivEdit);

    }
    public void setData(int pos,Employee employee){
        mtvName.setText(employee.getName());
        mtvAge.setText(employee.getAge()+"");
        mtvAddress.setText(employee.getAddress());
        mtvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(pos,employee);
            }
        });
    }

}
