package com.example.kyrgyznameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlphabetBoysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_boys);
    }

    public void onClickLetterA(View view) {
        Intent intent = new Intent(this, ListBoysNamesActivity.class);
        startActivity(intent);
    }
}