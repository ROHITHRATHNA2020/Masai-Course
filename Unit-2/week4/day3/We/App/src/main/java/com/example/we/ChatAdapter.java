package com.example.we;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<BaseModel> baseModelList;

    public ChatAdapter(ArrayList<BaseModel> baseModelList) {
        this.baseModelList = baseModelList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.send_item_layout, parent, false);
                return new SendViewHolder(view);
            case 1:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.reciever_item_layout, parent, false);
                return new ReceiverViewHolder(view1);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = baseModelList.get(position).getViewType();
        switch (viewType) {
            case 0:
                if (holder instanceof SendViewHolder) {
                    SenderModel senderModel = (SenderModel) baseModelList.get(position);
                    ((SendViewHolder) holder).setData(senderModel);
                }
                break;
            case 1:
                if (holder instanceof ReceiverViewHolder) {
                    ReceiverModel receiverModel = (ReceiverModel) baseModelList.get(position);
                    ((ReceiverViewHolder) holder).setData(receiverModel);
                }
                break;
        }
    }

    @Override
    public int getItemCount() {
        return baseModelList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return baseModelList.get(position).getViewType();
    }
}
