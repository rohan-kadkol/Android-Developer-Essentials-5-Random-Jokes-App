package com.rohankadkol.randomjokeapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnSeeJokesClicked(View view) {
        Intent intent = new Intent(this, JokesActivity.class);
        startActivity(intent);
    }
}
