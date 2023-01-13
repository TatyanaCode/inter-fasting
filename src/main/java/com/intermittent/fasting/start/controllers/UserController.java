package com.intermittent.fasting.start.controllers;

import com.intermittent.fasting.start.models.User;
import com.intermittent.fasting.start.repository.UserRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author danilova.tatyana 07.01.2023
 */
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    UserRepository userRepository;
    private final Map<String, Object> messages = new HashMap<>();
    @GetMapping("/")
    public String getAll(Model model){
        for (Map.Entry<String, Object> entry : messages.entrySet()) {
            model.addAttribute(entry.getKey(), entry.getValue());
        }
        return "pages/index";
    }

    @GetMapping("/register")
    public String register(Model model){
        for (Map.Entry<String, Object> entry : messages.entrySet()) {
            model.addAttribute(entry.getKey(), entry.getValue());
        }
        return "pages/register";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam("userName") String login,
                          @RequestParam("email") String email,
                          @RequestParam("password") String password){
        if (StringUtils.isEmpty(login) || StringUtils.isEmpty(email) || StringUtils.isEmpty(password)) {
            return "redirect:/register";
        }
        List<User> users = userRepository.findByUserName(login);
        if (users.size() > 0) {
            messages.put("errorMessage", "Недопустимый логин");
            return "redirect:/register";
        }
        User user = new User(login, password);
        userRepository.save(user);
        return "redirect:/";
    }

    @PostMapping("/signUp")
    public String signUp(@RequestParam("userName") String login,
                         @RequestParam("password") String password) {
        List<User> users = userRepository.findByUserName(login);
        if (users.size() == 1 && users.get(0).getPassword().equals(password)) {
            messages.put("isLogin", true);
            messages.remove("errorMessage");
            return "redirect:/";
        }
        messages.put("errorMessage", "Некорректный логин или пароль");
        messages.put("isLogin", false);
        return "redirect:/";
    }
}
