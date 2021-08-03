package com.example.events;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class PriceDetailsFragment extends Fragment {

    private EditText mCurrency;
    private EditText mPrice;
    private Button mbtnPreview;
    private EventListener eventListener;
    private String title;
    private String description;
    private String StartDate;
    private String EndDate;
    private String startTime;
    private String endTime;


    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            title = getArguments().getString("title");
            description = getArguments().getString("description");
            StartDate = getArguments().getString("startDate");
            EndDate = getArguments().getString("endDate");
            startTime = getArguments().getString("startTime");
            endTime = getArguments().getString("endTime");

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_price_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);

    }

    private void initViews(View view) {
        mCurrency = view.findViewById(R.id.etCurrency);
        mPrice = view.findViewById(R.id.etPrice);
        mbtnPreview = view.findViewById(R.id.btnPreview);
        mbtnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currency = mCurrency.getText().toString();
                String price = mPrice.getText().toString();
                Model model = new Model(title,description,StartDate,EndDate,startTime,endTime,currency,price);
                Intent intent = new Intent(getActivity(),PreviewActivity.class);
                intent.putExtra("model",model);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        eventListener = (EventListener) context;
    }


}