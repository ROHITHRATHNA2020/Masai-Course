package com.example.itemsclickswe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView recyclerView;
    ArrayList<StudentModel> studentModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setRecyclerView();

    }

    private void setRecyclerView() {
        StudentAdapter studentAdapter = new StudentAdapter(studentModelList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void buildList() {
        for(int i=0;i<50;i++){
            StudentModel studentModel = new StudentModel("Rohith",25,"Bengaluru","12-11-1995",R.drawable.jeff);
            studentModelList.add(studentModel);
        }
    }

    private void initViews() {
    recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void ItemClicked(StudentModel studentModel, int pos) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        studentModel.getName() + "\n"
                                + studentModel.getAge() + "\n"
                                + studentModel.getDOB() + "\n"
                                + studentModel.getAddress()
                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.dismiss();
                            }
                        }).
                        show();

    }
}