package com.intermittent.fasting.start.models;

import java.util.Date;

/**
 * author danilova.tatyana 06.01.2023
 */
public class BodyIndex {
    private long id;
    private User user;
    private double weight;
    private double height;
    private int age;
    private Date recordDate;

    public BodyIndex(User user) {
        this.user = user;
        this.recordDate = new Date();
    }

    public BodyIndex(User user, double weight) {
        this.user = user;
        this.weight = weight;
        this.recordDate = new Date();
    }

    public BodyIndex(User user, double weight, double height, int age) {
        this.user = user;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.recordDate = new Date();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getIdealIMT(){
        return 25;
    }

    public double getIMT(){
        return Math.round(weight / Math.pow(height/100, 2));
    }
}
