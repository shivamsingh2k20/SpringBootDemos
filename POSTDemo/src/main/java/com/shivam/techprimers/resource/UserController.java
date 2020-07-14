package com.shivam.techprimers.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.shivam.techprimers.model.User;
import com.shivam.techprimers.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<User> create(@RequestBody final User user){
        userService.create(user);
        return userService.getAll();
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
}