package com.rohankadkol.randomjokeapp5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.rohankadkol.randomjokeapp5.data.JokeHelper;

public class JokesActivity extends AppCompatActivity {
    TextView mTvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        mTvJoke = findViewById(R.id.tv_joke);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle("Jokes");

        setJoke();
    }

    public void onBtnNextJokeClicked(View view) {
        setJoke();
    }

    private void setJoke() {
        String joke = JokeHelper.getJoke();
        mTvJoke.setText(joke);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
