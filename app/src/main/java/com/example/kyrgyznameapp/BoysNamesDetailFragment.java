package com.example.kyrgyznameapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BoysNamesDetailFragment extends Fragment {

    private int boysNamesId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_boys_names_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null) {
            TextView nameTitle = view.findViewById(R.id.titleBoysNames);
            BoysNames boysNames = BoysNames.boysNames[boysNamesId];
            nameTitle.setText(boysNames.getName());
            TextView nameDescription = view.findViewById(R.id.descriptionBoysNames);
            nameDescription.setText(boysNames.getDescription());
        }
    }

    public void setBoysNames(int id) {
        this.boysNamesId = id;
    }
}