package com.example.evaluation;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHolder extends RecyclerView.ViewHolder {

    TextView mtvdate;
    TextView mtvPositve;
    TextView mtvNegative;
    TextView mtvHospitalisedCurrently;
    TextView mtvOnVentilatorCurrently;
    TextView mtvDeath;
    TextView mtvDateChecked;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvdate = itemView.findViewById(R.id.tvDate);
        mtvPositve = itemView.findViewById(R.id.tvPositive);
        mtvNegative = itemView.findViewById(R.id.tvNegative);
        mtvHospitalisedCurrently = itemView.findViewById(R.id.tvHospitalised);
        mtvOnVentilatorCurrently = itemView.findViewById(R.id.tvOnventilator);
        mtvDeath = itemView.findViewById(R.id.tvDeath);
        mtvDateChecked = itemView.findViewById(R.id.tvDateChecked);
    }

    public void setData(Model model) {
        mtvdate.setText(model.getDate() + "");
        mtvPositve.setText(model.getPositive() + "");
        mtvNegative.setText(model.getNegative() + "");
        mtvHospitalisedCurrently.setText(model.getHospitalisedCurrently() + "");
        mtvOnVentilatorCurrently.setText(model.getOnVentilatorCurrently() + "");
        mtvDeath.setText(model.getDeath() + "");
        mtvDateChecked.setText(model.getDateChecked());

    }
}
