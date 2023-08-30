package com.Fullstackwebapp.Fullstackwebapp1.controller;

import com.Fullstackwebapp.Fullstackwebapp1.exception.UserNotFoundException;
import com.Fullstackwebapp.Fullstackwebapp1.model.User;
import com.Fullstackwebapp.Fullstackwebapp1.repository.UserRepository;
import com.Fullstackwebapp.Fullstackwebapp1.service.UserService;
import jakarta.persistence.Id;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userService.createUser(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser ,@PathVariable Long id){
        return userService.updateUser(newUser,id);
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

}
