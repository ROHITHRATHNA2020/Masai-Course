package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class AnimalFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Animal> animalList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void buildList() {
        animalList.add(new Animal("zara",R.drawable.rabbit));
        animalList.add(new Animal("mango",R.drawable.squirrel));
        animalList.add(new Animal("tiger",R.drawable.tiger));
        animalList.add(new Animal("zara",R.drawable.rabbit));
        animalList.add(new Animal("mango",R.drawable.squirrel));
        animalList.add(new Animal("tiger",R.drawable.tiger));
        animalList.add(new Animal("zara",R.drawable.rabbit));
        animalList.add(new Animal("mango",R.drawable.squirrel));
        animalList.add(new Animal("tiger",R.drawable.tiger));
        animalList.add(new Animal("zara",R.drawable.rabbit));
        animalList.add(new Animal("mango",R.drawable.squirrel));
        animalList.add(new Animal("tiger",R.drawable.tiger));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_animal, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setRecyclerView();

    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }
}