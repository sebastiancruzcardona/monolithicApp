package com.eam.monolitichApp.controller;

import com.eam.monolitichApp.model.User;
import com.eam.monolitichApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("users", userService.listAllUsers());
        return "/users/list";
    }

    @GetMapping("/new")
    public String showNewUserForm(Model model){ //
        model.addAttribute("user", new User());
        return "users/form";
    }

    @PostMapping
    public String saveUser(User user, Model model){
        userService.saveUser(user);
        return "redirect:/users/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model){
        userService.deleteUser(id);
        return "redirect:/users/list";
    }
}
