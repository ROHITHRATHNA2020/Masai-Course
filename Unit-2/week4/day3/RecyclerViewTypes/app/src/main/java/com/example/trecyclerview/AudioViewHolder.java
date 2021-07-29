package com.example.trecyclerview;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AudioViewHolder extends RecyclerView.ViewHolder {
    private ItemClickListener itemClickListener;
    private TextView mtvtitle;
    private Button mbtnplay;
    private Button mbtnpause;


    public AudioViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvtitle = itemView.findViewById(R.id.tvtitle);
        mbtnplay = itemView.findViewById(R.id.btnplayAudio);
        mbtnpause = itemView.findViewById(R.id.pauseaudio);
    }

    public void setData(Model model){
        mtvtitle.setText(model.getContent());
        MediaPlayer mediaPlayer =  MediaPlayer.create(mtvtitle.getContext(),model.getResId());

        mbtnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        mbtnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }
            }
        });

    }
}
