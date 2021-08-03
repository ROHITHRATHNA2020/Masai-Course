package com.example.fragmentcomwe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class StudentsDetailsActivity extends AppCompatActivity implements CommunicationListener {

    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchStudentPresonalDetailsFragment();
    }

    private void launchStudentPresonalDetailsFragment() {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment fragment = new StudentPersonalDetailsFragment();
        fragmentTransaction.replace(R.id.container,fragment,"personal").commit();
    }


    @Override
    public void launchPerformanceFragment(Bundle bundle) {
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    StudentPerformanceDetailsFragment personalDetailsFragment = new StudentPerformanceDetailsFragment();
    personalDetailsFragment.setArguments(bundle);
    fragmentTransaction.replace(R.id.container,personalDetailsFragment,"personalDetailsFragment").addToBackStack("").commit();
    }


}












