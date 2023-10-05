package com.example.actistest.app.Controller;

import com.example.actistest.app.Entity.User;
import com.example.actistest.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class JsonPage {

    @Autowired
    private UserService userService;

    @GetMapping("/usersJson")
    public List<User> showUsersJSON() {
        return new ArrayList<>(userService.findAll());
    }

    @GetMapping("/userJson/{userId}")
    public User ShowParticularUser(@PathVariable int userId){
        return userService.findById(userId);
    }

    @GetMapping("/addUser/{email}/{phone_number}/{height}")
    public String addUser(@PathVariable String email, @PathVariable int phone_number, @PathVariable double height){

        if (userService.addUser(email, phone_number, height)) {
            return "User added!";
        }
        return "User already exists!";
    }
}
