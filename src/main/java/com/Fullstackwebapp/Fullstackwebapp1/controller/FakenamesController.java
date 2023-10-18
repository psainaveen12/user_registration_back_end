package com.Fullstackwebapp.Fullstackwebapp1.controller;

import com.Fullstackwebapp.Fullstackwebapp1.model.Fakenames;
import com.Fullstackwebapp.Fullstackwebapp1.service.FakenamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/user/id/{id}")
    Optional<Fakenames> getByIdNames(@PathVariable int id){
        return fakenamesService.getByIdNames(id);
    }

    @GetMapping(value = "/get10usersquery")
    Iterable<Fakenames> get10UsersQuery(){
        return fakenamesService.get10UsersQuery();
    }


    @GetMapping(value = "/user/blood/{bloodType}")
    Iterable<Fakenames> findByBloodType(@PathVariable("bloodType") String bloodType){
        return fakenamesService.findByBloodType(bloodType);
    }

    @GetMapping(value = "/user/clr/{color}")
    Iterable<Fakenames> findByColor(@PathVariable("color") String color){
        return fakenamesService.findByColor(color);
    }

    @GetMapping(value = "/cvv2/{CVV2}")
    Iterable<Fakenames> findByCVV2(@PathVariable int CVV2){
        return fakenamesService.findByCVV2(CVV2);
    }

    @PostMapping(value = "/createuser")
    Fakenames createFakeuser(@RequestBody Fakenames newFakenames){
        return fakenamesService.createFakeuser(newFakenames);
    }

    @DeleteMapping(value = "/delete/user/{id}")
    String deleteFakeUser(@PathVariable int id){
        return fakenamesService.deleteFakeUser(id);
    }
}
