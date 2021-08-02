package com.example.fragmenttransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mbtnAddA;
    private Button mbtnRemoveA;
    private Button mbtnReplaceAWBackstack;
    private Button mbtnReplaceAWOBackstack;
    private Button mbtnAddB;
    private Button mbtnRemoveB;
    private Button mbtnReplaceBWA;
    private FrameLayout flContainer;
    private FragmentManager fragmentManager;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mbtnAddA = findViewById(R.id.btnAddA);
        mbtnAddB = findViewById(R.id.btnAddB);
        mbtnRemoveA = findViewById(R.id.btnRemoveA);
        mbtnRemoveB = findViewById(R.id.btnRemoveB);
        mbtnReplaceBWA = findViewById(R.id.btnReplaceBWithA);
        mbtnReplaceAWOBackstack = findViewById(R.id.btnReplaceAWithBWithoutBackstack);
        mbtnReplaceAWBackstack = findViewById(R.id.btnReplaceAWithB);
        flContainer = findViewById(R.id.flContainer);
        fragmentManager = getSupportFragmentManager();
        mbtnAddA.setOnClickListener(this);
        mbtnAddB.setOnClickListener(this);
        mbtnRemoveA.setOnClickListener(this);
        mbtnRemoveB.setOnClickListener(this);
        mbtnReplaceBWA.setOnClickListener(this);
        mbtnReplaceAWBackstack.setOnClickListener(this);
        mbtnReplaceAWOBackstack.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btnAddA:
                addA();
                break;
            case R.id.btnAddB:
                addB();
                break;
            case R.id.btnRemoveA:
                removeA();

                break;
            case R.id.btnRemoveB:
                removeB();

                break;
            case R.id.btnReplaceAWithB:
                repalceAWB();


                break;
            case R.id.btnReplaceAWithBWithoutBackstack:
                replaceAWBwithBS();

                break;

            case R.id.btnReplaceBWithA:
                repalceBWA();
                break;

        }


    }

    private void replaceAWBwithBS() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.replace(R.id.flContainer, fragmentB, "fragmentB").addToBackStack("fragB").commit();
    }

    private void removeB() {
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentByTag("fragmentB");
        if (fragmentB != null) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.remove(fragmentB).commit();
        }
    }

    private void removeA() {
        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.remove(fragmentA).commit();
        }
    }

    private void repalceBWA() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        transaction.replace(R.id.flContainer, fragmentA, "fragmentA").commit();
    }

    private void repalceAWB() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.replace(R.id.flContainer, fragmentB, "fragmentB").commit();
    }


    private void addA() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        transaction.add(R.id.flContainer, fragmentA, "fragmentA").addToBackStack("addA").commit();
    }

    private void addB() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.add(R.id.flContainer, fragmentB, "fragmentB").addToBackStack("addB").commit();

    }
}
