package com.example.legends;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListeners {

    private RecyclerView recyclerView;
    ArrayList<Legends> legendList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyclerView);
        buildLegendsList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        LegendsAdapter legendsAdapter = new LegendsAdapter(legendList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(legendsAdapter);

    }

    private void buildLegendsList() {

        legendList.add(new Legends("MicroSoft",R.drawable.bill_gates,"64","Bussiness"));
        legendList.add(new Legends("Amazon",R.drawable.jeff,"56","Bussiness"));
        legendList.add(new Legends("Prateek",R.drawable.bill_gates,"31","Bussiness"));
        legendList.add(new Legends("MicroSoft",R.drawable.bill_gates,"64","Bussiness"));
        legendList.add(new Legends("Amazon",R.drawable.jeff,"56","Bussiness"));
        legendList.add(new Legends("Prateek",R.drawable.bill_gates,"31","Bussiness"));
        legendList.add(new Legends("MicroSoft",R.drawable.bill_gates,"64","Bussiness"));
        legendList.add(new Legends("Amazon",R.drawable.jeff,"56","Bussiness"));
        legendList.add(new Legends("Prateek",R.drawable.bill_gates,"31","Bussiness"));
        legendList.add(new Legends("MicroSoft",R.drawable.bill_gates,"64","Bussiness"));
        legendList.add(new Legends("Amazon",R.drawable.jeff,"56","Bussiness"));
        legendList.add(new Legends("Prateek",R.drawable.bill_gates,"31","Bussiness"));
    }

    @Override
    public void onItemClicked(Legends legends) {
        new AlertDialog.Builder(this)
            .setMessage("Company Name:"+legends.getCompanyName()+"\n" +
                    "Age "+legends.getAge())
        .show();
    }
}