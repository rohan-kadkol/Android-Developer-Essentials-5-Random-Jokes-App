package com.rohankadkol.randomjokeapp5.data;

import android.content.Context;

import com.rohankadkol.randomjokeapp5.R;

import java.util.ArrayList;
import java.util.List;

public class JokeHelper {
    private static int currentJoke = 0;
    private static String[] jokes = null;

    public static void initializeJokes(Context context) {
        if (jokes != null) {
            return;
        }

        jokes = context.getResources().getStringArray(R.array.jokes);
    }

    public static String getJoke() {
        currentJoke++;
        if (currentJoke >= jokes.length) {
            currentJoke = 0;
        }

        return jokes[currentJoke];
    }
}
