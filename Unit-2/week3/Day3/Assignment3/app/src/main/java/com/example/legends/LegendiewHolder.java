package com.example.legends;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class LegendiewHolder extends RecyclerView.ViewHolder {

    private TextView mtvCompany;
    private ImageView mCeo;
    private TextView mtvAge;
    private TextView mProfession;
    private ItemClickListeners itemClickListeners;
    private RelativeLayout rl1;
    private CardView cd1;

    public LegendiewHolder(@NonNull View itemView,ItemClickListeners itemClickListeners) {
        super(itemView);
        this.itemClickListeners = itemClickListeners;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvCompany = itemView.findViewById(R.id.tvCompanyName);
        mCeo = itemView.findViewById(R.id.imCeo);
        mtvAge = itemView.findViewById(R.id.tvAge);
        mProfession = itemView.findViewById(R.id.tvProfession);
        rl1 = itemView.findViewById(R.id.rl1);
        cd1 = itemView.findViewById(R.id.cd1);
    }

    public void setData(Legends legends){
        mtvCompany.setText(legends.getCompanyName());
        mCeo.setImageResource(legends.getImage());
        mtvAge.setText(legends.getAge());
        mProfession.setText(legends.getProfession());
        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListeners.onItemClicked(legends);
            }
        });
    }


}
