package com.example.we;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText metOption;
    private EditText metSendMsg;
    private ImageView mtvSend;
    private ArrayList<BaseModel> messageList = new ArrayList<>();
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
       setRecycelerView();

    }

    private void setRecycelerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        chatAdapter = new ChatAdapter(messageList);
        recyclerView.setAdapter(chatAdapter);
    }

    private void buildList() {
        if(metOption.getText().toString().equals("0")){
            messageList.add(new SenderModel(metSendMsg.getText().toString()));
        }else if(metOption.getText().toString().equals("1")){
            messageList.add(new ReceiverModel(metSendMsg.getText().toString()));
        }
        chatAdapter.notifyDataSetChanged();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        metOption = findViewById(R.id.etChoice);
        metSendMsg = findViewById(R.id.etSendMessage);
        mtvSend = findViewById(R.id.ivSend);
        mtvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildList();
            }
        });
    }
}