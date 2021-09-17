package com.example.kyrgyznameapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ListBoysNamesActivity extends AppCompatActivity implements BoysNamesListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_boys_names);

    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailBoysNamesActivity.class);
        intent.putExtra(DetailBoysNamesActivity.EXTRA_BOYS_NAMES_ID, (int) id);
        startActivity(intent);
    }
}