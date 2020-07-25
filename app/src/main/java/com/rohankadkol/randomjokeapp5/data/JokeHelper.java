package com.rohankadkol.randomjokeapp5.data;

import android.content.Context;

import com.rohankadkol.randomjokeapp5.R;

import java.util.ArrayList;
import java.util.List;

public class JokeHelper {
    private static int currentJoke = 0;

    // TODO: When using strings.xml, set jokes to null. (Calling initializeJokes() will populate jokes from strings.xml)
    private static String[] jokes = {
            "Why you shouldn\'t write with a broken pencil?\n\n\n\n… because it\'s pointless",
            "What happens when a frog\'s car breaks?\n\n\n\n… it gets toad",
            "What do you get when you put a vest on an alligator?\n\n\n\n… an investigator",
            "Why was the stadium so cool?\n\n\n\n… it was filled with fans",
            "Did you hear about the two antennas that got married?\n\n\n\n… the ceremony was okay, but, the reception was great!",
            "Why was the cheetah so bad at hide and seek?\n\n\n\n… no matter where she hid, she was always spotted",
            "What does a nosy pepper do?\n\n\n\n… it gets jalapeno business",
            "Why does a duck have tail feathers?\n\n\n\n… to cover its butt-quack",
            "What did the teacher do with her students\' report on the history of cheese?\n\n\n\n… she grated it",
            "What do cats eat for breakfast?\n\n\n\n… mice-krispies",
            "Why didn\'t the melons get married?\n\n\n\n… because they can\'t elope",
            "What do clouds wear under their shorts?\n\n\n\n… thunder-pants",
    };

    public static void initializeJokes(Context context) {
        if (jokes != null) {
            return;
        }

        // TODO: Uncomment this line when using strings.xml
//        jokes = context.getResources().getStringArray(R.array.jokes);
    }

    public static String getJoke() {
        currentJoke++;
        if (currentJoke >= jokes.length) {
            currentJoke = 0;
        }

        return jokes[currentJoke];
    }
}
