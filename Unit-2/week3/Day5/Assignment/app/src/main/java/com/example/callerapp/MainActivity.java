package com.example.callerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<Contacts> contactsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buildContactList();
        setRecyclerView();

    }

    private void setRecyclerView() {
        Adapter adapter = new Adapter(contactsList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildContactList() {
        contactsList.add(new Contacts("rohith", "9902162319"));
        contactsList.add(new Contacts("ramesh", "1678657657"));
        contactsList.add(new Contacts("rajesh", "3157864467"));
        contactsList.add(new Contacts("abdul", "4958865435"));
        contactsList.add(new Contacts("rahim", "2345465376"));
        contactsList.add(new Contacts("mino", "5544335645"));
        contactsList.add(new Contacts("jones", "6543675875"));
        contactsList.add(new Contacts("ziza", "4523424543"));
        contactsList.add(new Contacts("aiaya", "66867968785"));
        contactsList.add(new Contacts("rani", "9876475685"));
        contactsList.add(new Contacts("sulap", "87976567574"));
        contactsList.add(new Contacts("jodi", "52356457647"));
        contactsList.add(new Contacts("kare", "6356356467"));
        contactsList.add(new Contacts("taxim", "6354646756"));
        contactsList.add(new Contacts("tulan", "5432173453"));
        contactsList.add(new Contacts("mahi", "3453645634"));
        contactsList.add(new Contacts("olanker", "7654424364"));
        contactsList.add(new Contacts("bushin", "2345678231"));
        contactsList.add(new Contacts("diten", "2345123678"));

    }

}