package com.example.events;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TimeAndDateFragment extends Fragment {

    private EditText mStartDate;
    private EditText mEndDate;
    private EditText mStartTime;
    private EditText mEndTime;
    private Button mbtn;
    private EventListener eventListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_time_and_date, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        eventListener = (EventListener) context;
    }

    private void initViews(View view) {
    mStartDate = view.findViewById(R.id.etStartData);
    mEndDate = view.findViewById(R.id.etEndDate);
    mStartTime = view.findViewById(R.id.etStartTime);
    mEndTime = view.findViewById(R.id.etEndTime);
    mbtn = view.findViewById(R.id.btnNext2);
    mbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String startDate = mStartDate.getText().toString();
            String EndDate = mEndDate.getText().toString();
            String startTime = mStartTime.getText().toString();
            String endTime = mEndTime.getText().toString();
            Bundle bundle = new Bundle();
            bundle.putString("startDate",startDate);
            bundle.putString("endDate",EndDate);
            bundle.putString("startTime",startTime);
            bundle.putString("endTime",endTime);
            if(eventListener!=null){
                eventListener.launchPriceDetailsFragment(bundle);
            }
        }
    });
    }



}