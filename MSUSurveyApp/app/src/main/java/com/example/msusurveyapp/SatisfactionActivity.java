package com.example.msusurveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.msusurveyapp.MainActivity;

public class SatisfactionActivity extends AppCompatActivity {

    private String office;
    private float rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satisfaction);

        Intent intent = getIntent();
        office = intent.getStringExtra("EXTRA_OFFICE");
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(office);

        RatingBar mBar = (RatingBar) findViewById(R.id.ratingBar);
        mBar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RatingBar bar = (RatingBar) view;
                rating = bar.getRating();
            }
        });
    }

    public void startComments(View view) {
        Intent intent = new Intent(this, CommentActivity.class);
        Bundle extras = new Bundle();
        extras.putString("EXTRA_OFFICE", office);
        extras.putFloat("EXTRA_RATING", rating);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
