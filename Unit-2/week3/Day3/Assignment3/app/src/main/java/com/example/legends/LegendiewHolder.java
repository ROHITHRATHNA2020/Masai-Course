package com.example.legends;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LegendiewHolder extends RecyclerView.ViewHolder {

    private TextView mtvCompany;
    private ImageView mCeo;
    private TextView mtvAge;
    private TextView mProfession;

    public LegendiewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvCompany = itemView.findViewById(R.id.tvCompanyName);
        mCeo = itemView.findViewById(R.id.imCeo);
        mtvAge = itemView.findViewById(R.id.tvAge);
        mProfession = itemView.findViewById(R.id.tvProfession);
    }

    public void setData(Legends legends){
        mtvCompany.setText(legends.getCompanyName());
        mCeo.setImageResource(legends.getImage());
        mtvAge.setText(legends.getAge());
        mProfession.setText(legends.getProfession());
    }


}
