package com.Fullstackwebapp.Fullstackwebapp1.controller;

import com.Fullstackwebapp.Fullstackwebapp1.model.Fakenames;
import com.Fullstackwebapp.Fullstackwebapp1.service.FakenamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/fakenames")
public class FakenamesController {

    @Autowired
    FakenamesService fakenamesService;

    @GetMapping(value = "/allusers")
    Iterable<Fakenames> getAllNames(){
        return fakenamesService.getAllNames();
    }

    @GetMapping(value = "/10users")
    Iterable<Fakenames> get10Names(){
        return fakenamesService.get10Names();
    }

    @GetMapping(value = "/user/{id}")
    Optional<Fakenames> getByIdNames(@PathVariable int id){
        return fakenamesService.getByIdNames(id);
    }
}
