package com.example.we;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SendViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvSnederMessage;

    public SendViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvSnederMessage =itemView.findViewById(R.id.tvSenderMessage);

    }

    public void setData(SenderModel senderModel){
    mtvSnederMessage.setText(senderModel.getMessage());
    }
}
