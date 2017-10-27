package com.example.msusurveyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private TextView textView;
    private EditText editText;
    private View.OnClickListener onClickRatingBar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RatingBar bar = (RatingBar) view;

            
            if (bar.getRating() < 4.0) {
                textView.setVisibility(View.VISIBLE);
                editText.setVisibility(View.VISIBLE);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar bar = (RatingBar) findViewById(R.id.ratingBar);
        bar.setOnClickListener(onClickRatingBar);

        textView = (TextView) findViewById(R.id.textView4);
        editText = (EditText) findViewById(R.id.editText3);

        addItemsOnSpinner1();
    }

    public void addItemsOnSpinner1() {
        spinner = (Spinner) findViewById(R.id.spinner);
        List <String> locationList = new ArrayList<String>();

        locationList.add("Library");
        locationList.add("Book Store");
        locationList.add("Bursar");
        locationList.add("Human Resources");

        Collections.sort(locationList);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item);
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }
}
