package com.intermittent.fasting.start.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * author danilova.tatyana 06.01.2023
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String password;
    private String name;
    private String surname;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Hunger> hungers = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<BodyIndex> bodyIndexes = new ArrayList<>();

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public List<Hunger> getHungers() {
        return hungers;
    }

    public List<BodyIndex> getBodyIndexes() {
        return bodyIndexes;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setHungers(List<Hunger> hungers) {
        this.hungers = hungers;
    }

    public void setBodyIndexes(List<BodyIndex> bodyIndexes) {
        this.bodyIndexes = bodyIndexes;
    }
}
