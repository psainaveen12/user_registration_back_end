package com.Fullstackwebapp.Fullstackwebapp1.controller;

import com.Fullstackwebapp.Fullstackwebapp1.model.User;
import com.Fullstackwebapp.Fullstackwebapp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
//@CrossOrigin("http://localhost:3000/")
@CrossOrigin("*")
@RequestMapping("/user_reg")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    User newUser(@RequestBody User newUser){
        return userService.createUser(newUser);
    }

    @GetMapping("/allusers")
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/updateuser/{id}")
    User updateUser(@RequestBody User newUser ,@PathVariable Long id){
        return userService.updateUser(newUser,id);
    }

    @DeleteMapping("/deleteuser/{id}")
    String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

}
