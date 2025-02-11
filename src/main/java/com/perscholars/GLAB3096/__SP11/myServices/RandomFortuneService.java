package com.perscholars.GLAB3096.__SP11.myServices;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneServices {

    private String[] data = {"Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck", "The journey is the reward"};


    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}