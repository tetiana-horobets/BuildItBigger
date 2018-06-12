package com.example.javajokes;

import java.util.ArrayList;
import java.util.Random;

public class JavaJokes {

    public String getJoke(){
        ArrayList<String> jokes = new ArrayList<>();
        jokes.add("Dear Santa,\n" +
                "Please do not leave my gift under the Christmas tree. Drive it straight into the garage.\n");
        jokes.add("Saint Valentine is the guardian of the salespeople of cosmetics, perfume, underwear and chocolate.\n");
        jokes.add("Single guys often dream of having a wise, beautiful and caring wife. But married guys think about it even more often.\u200B\n");
        jokes.add("Question: can a joke, played on April 1st, become a present for the New Year?\n" +
                "Answer: yes, as there's exactly 9 months period\n");
        jokes.add("Instagram - it's a place where we need to register our moms, cause only they wonder how we are dressed and what we ate.\n");
        Random random = new Random();
        int randomNum = random.nextInt(jokes.size());
        return jokes.get(randomNum);
    }
}
