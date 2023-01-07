package com.intermittent.fasting.start.models;

import java.util.ArrayList;
import java.util.List;

/**
 * author danilova.tatyana 06.01.2023
 */
public class User {
    private long id;
    private final String userName;
    private String password;
    private String name;
    private String surname;
    private final List<Hunger> hungers;
    private final List<BodyIndex> bodyIndexes;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.hungers = new ArrayList<>();
        this.bodyIndexes = new ArrayList<>();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
