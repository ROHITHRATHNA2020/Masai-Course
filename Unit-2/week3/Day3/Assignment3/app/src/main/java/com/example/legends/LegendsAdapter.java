package com.example.legends;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LegendsAdapter extends RecyclerView.Adapter<LegendiewHolder> {

    private ArrayList<Legends> legendList;
   public LegendsAdapter(ArrayList<Legends> legendList){
       this.legendList = legendList;
   }

    @Override
    public LegendiewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.legends_layout,parent,false);
        return new LegendiewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LegendiewHolder holder, int position) {
       Legends legends = legendList.get(position);
       holder.setData(legends);

    }

    @Override
    public int getItemCount() {
        return legendList.size();
    }
}
