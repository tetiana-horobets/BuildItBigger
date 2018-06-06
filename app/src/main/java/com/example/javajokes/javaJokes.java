package com.example.javajokes;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class javaJokes {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public String getJoke(){
        ArrayList<String> jokes = new ArrayList<>();
        jokes.add("Dear Santa,\n" +
                "Please do not leave my gift under the Christmas tree. Drive it straight into the garage.\n" +
                "Read more at http://www.funny-jokes-quotes.com/#OCP4zLLC8zBgRjiO.99");
        jokes.add("Saint Valentine is the guardian of the salespeople of cosmetics, perfume, underwear and chocolate.\n" +
                "Read more at http://www.funny-jokes-quotes.com/#OCP4zLLC8zBgRjiO.99");
        jokes.add("Single guys often dream of having a wise, beautiful and caring wife. But married guys think about it even more often.\u200B\n" +
                "Read more at http://www.funny-jokes-quotes.com/#OCP4zLLC8zBgRjiO.99");
        jokes.add("Question: can a joke, played on April 1st, become a present for the New Year?\n" +
                "Answer: yes, as there's exactly 9 months period\n" +
                "Read more at http://www.funny-jokes-quotes.com/#OCP4zLLC8zBgRjiO.99");
        jokes.add("Instagram - it's a place where we need to register our moms, cause only they wonder how we are dressed and what we ate.\n" +
                "Read more at http://www.funny-jokes-quotes.com/#OCP4zLLC8zBgRjiO.99");
        int randomNum = ThreadLocalRandom.current().nextInt(0, 4 + 1);

        return jokes.get(randomNum);
    }
}
