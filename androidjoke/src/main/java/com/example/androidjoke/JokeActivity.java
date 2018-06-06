package com.example.androidjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView showJoke = findViewById(R.id.showJoke);
        String joke = getIntent().getStringExtra("joke_key");
        showJoke.setText(joke);
    }
}
