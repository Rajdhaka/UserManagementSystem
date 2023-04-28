package com.geekster.userManagementSystem.controller;

import com.geekster.userManagementSystem.model.User;
import com.geekster.userManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
     @GetMapping("/getAllUser")
    public List<User> getAllUser(){
         return userService.getAllUser();
    }
    @GetMapping("/getUser/{userId}")
    public User getUserById(@PathVariable String userId){
         return userService.getUserById(userId);
    }
    @PostMapping("/addUser")
    public String addUser(@Valid @RequestBody User user) {
         return  userService.addUser(user);
    }
    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return userService.deleteUserById(userId);
    }

    @PutMapping(value = "/updateUserInfo/{userId}/{email}/{phoneNo}")
    public String updateUserInfo(@PathVariable String userId, @PathVariable String email, @PathVariable String phoneNo){
        return userService.updateUserInfo(userId,email,phoneNo);
    }
}
