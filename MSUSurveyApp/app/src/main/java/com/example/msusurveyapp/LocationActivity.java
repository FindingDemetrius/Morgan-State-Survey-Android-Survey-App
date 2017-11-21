package com.example.msusurveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class LocationActivity extends AppCompatActivity {

    private String officeVisited;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }

    public void satisfationLevel(View view) {
        Intent intent = new Intent(this, SatisfactionActivity.class);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
        String officeVisited = mySpinner.getSelectedItem().toString();
        intent.putExtra("EXTRA_OFFICE", officeVisited);
        startActivity(intent);
    }
}
