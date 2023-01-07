package com.intermittent.fasting.start.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author danilova.tatyana 06.01.2023
 */
class BodyIndexTest {

    @Test
    public void getBodyIndexH170W70Test(){
        User user = new User("login", "password");
        BodyIndex bodyIndex = new BodyIndex(user);
        bodyIndex.setHeight(170);
        bodyIndex.setWeight(70);
        double imt = bodyIndex.getIMT();
        assertEquals(24, imt);
    }

    @Test
    public void getBodyIndexH180W50Test(){
        User user = new User("login", "password");
        BodyIndex bodyIndex = new BodyIndex(user, 50);
        bodyIndex.setHeight(180);
        double imt = bodyIndex.getIMT();
        assertEquals(15, imt);
    }

    @Test
    public void getBodyIndexH150W60A25Test(){
        User user = new User("login", "password");
        BodyIndex bodyIndex = new BodyIndex(user, 60, 170, 25);
        double imt = bodyIndex.getIMT();
        assertEquals(21, imt);
    }
}