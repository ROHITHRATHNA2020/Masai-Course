package com.example.recyclerwe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();

    }

    private void buildStudentList() {
        studentList = new ArrayList<>();
        Student student1 = new Student ("rohith",25,"Emp123");
        studentList.add(student1);
        Student student2 = new Student ("rohith1",25,"Emp113");
        studentList.add(student2);
        for(int i=0;i<13;i++){
            Student student = new Student("xyz"+i,21,"Emp125");
            studentList.add(student);
        }
    }

    private void setRecyclerView(){
        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    public void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
    }

}