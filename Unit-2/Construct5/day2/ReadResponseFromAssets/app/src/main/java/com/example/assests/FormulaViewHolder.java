package com.example.assests;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FormulaViewHolder  extends RecyclerView.ViewHolder {

    private TextView mtvName;
    private TextView mtvUrl;

    public FormulaViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mtvName = itemView.findViewById(R.id.tvformulaName);
        mtvUrl = itemView.findViewById(R.id.tvformulaUrl);
    }

    public void setData(FormulasModel formulasModel){
        mtvName.setText(formulasModel.getFormulae());
        mtvUrl.setText(formulasModel.getUrl());
    }


}
