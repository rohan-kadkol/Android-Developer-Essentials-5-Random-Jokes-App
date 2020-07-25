package com.rohankadkol.randomjokeapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rohankadkol.randomjokeapp5.data.JokeHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Initialize jokes
    }

    public void onBtnSeeJokesClicked(View view) {
        // TODO: Use intents to go to the JokesActivity
    }
}
