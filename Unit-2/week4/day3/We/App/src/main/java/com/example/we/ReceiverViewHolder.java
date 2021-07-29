package com.example.we;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReceiverViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvReceiverSendmsg;

    public ReceiverViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvReceiverSendmsg = itemView.findViewById(R.id.tvReceiverMessage);
    }

    public void setData(ReceiverModel receiverModel){
        mtvReceiverSendmsg.setText(receiverModel.getMessage());

    }
}
