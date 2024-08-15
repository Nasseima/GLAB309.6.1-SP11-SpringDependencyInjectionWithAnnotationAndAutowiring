package com.perscholars.GLAB3096.__SP11.myServices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices{

    @Override
    public String getFortune() {
        return "Database connection";
    }
}
