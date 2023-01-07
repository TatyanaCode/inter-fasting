package com.intermittent.fasting.start.models;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * author danilova.tatyana 06.01.2023
 */
public class Hunger {
    private long id;
    private User user;
    private HungerType hungerType;
    private Date dateStart;
    private Date dateStop;
    private Date dateUserStop;
    private boolean isUserStop;
    private long timeHunger;

    public Hunger(User user, HungerType hungerType) {
        this.user = user;
        this.hungerType = hungerType;
        this.dateStart = new Date();
        this.dateStop = DateUtils.addHours(this.dateStart, getHungerTime());
        this.isUserStop = false;
    }

    public void userStop(){
        this.isUserStop = true;
        this.dateUserStop = new Date();
    }

    public String getTimeHunger(){
        if (!isUserStop) {
            return String.format("%s",getHungerTime());
        }
        this.timeHunger =  (dateUserStop.getTime() - dateStart.getTime())/360;
        return String.format("%s",this.timeHunger);
    }

    private int getHungerTime(){
        if (hungerType == null) {
            return 0;
        }
        switch (hungerType) {
            case HOUR16 -> {
                return 16;
            }
            case HOUR18 -> {
                return 18;
            }
            case HOUR24 -> {
                return 24;
            }
            case NONE -> {
                return 0;
            }
        }
        return 0;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public HungerType getHungerType() {
        return hungerType;
    }

    public void setHungerType(HungerType hungerType) {
        this.hungerType = hungerType;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateStop() {
        return dateStop;
    }

    public void setDateStop(Date dateStop) {
        this.dateStop = dateStop;
    }

    public Date getDateUserStop() {
        return dateUserStop;
    }

    public void setDateUserStop(Date dateUserStop) {
        this.dateUserStop = dateUserStop;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
