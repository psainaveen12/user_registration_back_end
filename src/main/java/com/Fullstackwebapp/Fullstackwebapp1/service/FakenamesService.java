package com.Fullstackwebapp.Fullstackwebapp1.service;


import com.Fullstackwebapp.Fullstackwebapp1.model.Fakenames;
import com.Fullstackwebapp.Fullstackwebapp1.repository.FakenamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FakenamesService {

    @Autowired
    FakenamesRepository fakenamesRepository;

    public Iterable<Fakenames> getAllNames(){
        return fakenamesRepository.findAll();
    }
    public Iterable<Fakenames> get10Names(){
        return fakenamesRepository.get10Users();
    }
    public Optional<Fakenames> getByIdNames(int id){
        return fakenamesRepository.findById(id);
    }




}
