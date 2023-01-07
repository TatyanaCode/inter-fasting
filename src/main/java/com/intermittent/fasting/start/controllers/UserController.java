package com.intermittent.fasting.start.controllers;

import com.intermittent.fasting.start.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author danilova.tatyana 07.01.2023
 */
@Controller
@RequestMapping("/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/")
    public String getAll(){
        return "pages/index";
//        List<User> users = new ArrayList<>();
//
//        users.add(new User("ivan", "ivanoV"));
//        users.add(new User("ivan2", "ivanoV1"));
//        users.add(new User("ivan3", "ivanoV2"));
//        users.add(new User("ivan4", "ivanoV3"));
//        userRepository.saveAll(users);
//        BodyIndex bodyIndex = new BodyIndex(user, 60, 170, 19);
//        Hunger hunger = new Hunger(user, HungerType.HOUR16);

//        bodyIndexRepository.save(bodyIndex);
//        hungerRepository.save(hunger);
//        return userRepository.findAll();
    }

    @GetMapping("/register")
    public String register(){
        return "pages/register";
    }



}
