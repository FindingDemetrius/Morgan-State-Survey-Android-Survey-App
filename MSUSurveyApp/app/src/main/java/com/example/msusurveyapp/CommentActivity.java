package com.example.msusurveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CommentActivity extends AppCompatActivity {

    private String office;
    private float rating;
    private String comment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);


        Bundle extras = getIntent().getExtras();
        office = extras.getString("EXTRA_OFFICE");
        rating = extras.getFloat("EXTRA_RATING");

        TextView textView = (TextView) findViewById(R.id.textView4);
        textView.setText(office);
    }

    public void submitFeedback(View view) {
        Intent intent = new Intent(this, ThanksActivity.class);
        Bundle extras = new Bundle();

        EditText editText = (EditText) findViewById(R.id.editText);
        comment = editText.getText().toString();

        extras.putString("EXTRA_OFFICE", office);
        extras.putFloat("EXTRA_RATING", rating);
        extras.putString("EXTRA_COMMENT", comment);
        startActivity(intent);
    }
}
