package com.example.kyrgyznameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailBoysNamesActivity extends AppCompatActivity {

    public static final String EXTRA_BOYS_NAMES_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_boys_names);

        BoysNamesDetailFragment boysNamesDetailFragment = (BoysNamesDetailFragment) getSupportFragmentManager().findFragmentById(R.id.nameDetailFragment);
        int boysNamesId = (int) getIntent().getExtras().get(EXTRA_BOYS_NAMES_ID);
        boysNamesDetailFragment.setBoysNames(boysNamesId);
    }
}