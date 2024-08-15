package com.perscholars.GLAB3096.__SP11.myServices;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
