package com.example.sports;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SportViewHolder extends RecyclerView.ViewHolder {

    private ImageView mivImage;
    private TextView mtvSportName;

    public SportViewHolder(@NonNull  View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
    mivImage = itemView.findViewById(R.id.ivImage);
    mtvSportName = itemView.findViewById(R.id.tvSportName);
    }

    public void setData(SportModel sportModel){
        mivImage.setImageResource(sportModel.getImage());
        mtvSportName.setText(sportModel.getSportName());
    }

}
