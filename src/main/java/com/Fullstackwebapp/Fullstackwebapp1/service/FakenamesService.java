package com.Fullstackwebapp.Fullstackwebapp1.service;


import com.Fullstackwebapp.Fullstackwebapp1.exception.UserNotFoundException;
import com.Fullstackwebapp.Fullstackwebapp1.model.Fakenames;
import com.Fullstackwebapp.Fullstackwebapp1.repository.FakenamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Random;

@Service
public class FakenamesService {

    @Autowired
    FakenamesRepository fakenamesRepository;

    private Random random = new Random();

    public Iterable<Fakenames> getAllNames(){
        return fakenamesRepository.findAll();
    }
    public Iterable<Fakenames> get10UsersQuery(){
        return fakenamesRepository.get10UsersQuery();
    }
    public Optional<Fakenames> getByIdNames(int id){
        return fakenamesRepository.findById(id);
    }

    public Iterable<Fakenames> findByBloodType(String bloodType){
        return fakenamesRepository.findByBloodType(bloodType);
    }

    public Iterable<Fakenames> findByColor(String color){
        return fakenamesRepository.findByColor(color);
    }

    public Iterable<Fakenames> findByCVV2(int CVV2){
        return fakenamesRepository.findByCVV2(CVV2);
    }

    public Fakenames createFakeuser(Fakenames newFakenames){
//        newFakenames.setPictureurl("https://randomuser.me/api/portraits/"+ newFakenames.getGender() + "/" + random.nextInt(100) + ".jpg");

        if ("female".equals(newFakenames.getGender()))
            newFakenames.setPictureurl("https://randomuser.me/api/portraits/women/" + random.nextInt(100) + ".jpg");
        else if ("male".equals(newFakenames.getGender()))
            newFakenames.setPictureurl("https://randomuser.me/api/portraits/men/" + random.nextInt(100) + ".jpg");
        else
            newFakenames.setPictureurl("https://randomuser.me/api/portraits/men/" + random.nextInt(100) + ".jpg");
        return fakenamesRepository.save(newFakenames);
    }
    public String deleteFakeUser(int id){
        if(!fakenamesRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        fakenamesRepository.deleteById(id);
        return "User with id "+id +" has been Deleted Successfully!!";

    }

}
