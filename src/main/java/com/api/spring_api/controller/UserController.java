package com.api.spring_api.controller;

import com.api.spring_api.domain.entities.user.User;
import com.api.spring_api.domain.requests.UserRequest;
import com.api.spring_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String ok() {
        return "Ok";
    }

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody UserRequest request) {
        User user = this.userService.createUser(request);
        return ResponseEntity.ok(user);
    }
}
