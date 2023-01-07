package com.intermittent.fasting.start.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author danilova.tatyana 06.01.2023
 */
class HungerTest {

    @Test
    public void getTimeHunger16Test(){
        User user = new User("login", "password");
        Hunger hunger = new Hunger(user, HungerType.HOUR16);
        String hungerTime = hunger.getTimeHunger();
        assertEquals("16", hungerTime);
    }

    @Test
    public void getTimeHunger18Test(){
        User user = new User("login", "password");
        Hunger hunger = new Hunger(user, HungerType.HOUR18);
        String hungerTime = hunger.getTimeHunger();
        assertEquals("18", hungerTime);
    }

    @Test
    public void getTimeHunger24Test(){
        User user = new User("login", "password");
        Hunger hunger = new Hunger(user, HungerType.HOUR24);
        String hungerTime = hunger.getTimeHunger();
        assertEquals("24", hungerTime);
    }

    @Test
    public void getTimeHungerNoneTest(){
        User user = new User("login", "password");
        Hunger hunger = new Hunger(user, HungerType.NONE);
        String hungerTime = hunger.getTimeHunger();
        assertEquals("0", hungerTime);
    }

    @Test
    public void getTimeHungerUserStopTest(){
        User user = new User("login", "password");
        Hunger hunger = new Hunger(user, HungerType.HOUR18);
        hunger.userStop();
        String hungerTime = hunger.getTimeHunger();
        assertEquals("0", hungerTime);
    }
}