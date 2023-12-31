package com.Fullstackwebapp.Fullstackwebapp1.service;

import com.Fullstackwebapp.Fullstackwebapp1.exception.UserNotFoundException;
import com.Fullstackwebapp.Fullstackwebapp1.model.User;
import com.Fullstackwebapp.Fullstackwebapp1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String timeFormate(LocalTime time){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:s a");
        return time.format(formatter);
    }

    public User createUser(User newUser){
        newUser.setDate(LocalDate.now());
        newUser.setTime(timeFormate(LocalTime.now()));
        newUser.setPictureurl("https://randomuser.me/api/portraits/" + newUser.getGender() + "/" + new Random().nextInt(100) +".jpg");
//        if ("female".equals(newUser.getGender()))
//            newUser.setPictureurl("https://randomuser.me/api/portraits/women/" + new Random().nextInt(100) + ".jpg");
//        else if ("male".equals(newUser.getGender()))
//            newUser.setPictureurl("https://randomuser.me/api/portraits/men/" + new Random().nextInt(100) + ".jpg");
//        else
//            newUser.setPictureurl("https://randomuser.me/api/portraits/men/" + new Random().nextInt(100) + ".jpg");
        return userRepository.save(newUser);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }

    public User updateUser(User newUser , Long id){
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    user.setPhonenumber(newUser.getPhonenumber());
                    user.setDate(LocalDate.now());
                    user.setTime(timeFormate(LocalTime.now()));
                    user.setGender(newUser.getGender());
                    user.setPictureurl("https://randomuser.me/api/portraits/" + newUser.getGender() + "/" + new Random().nextInt(100) +".jpg");
//        if ("female".equals(newUser.getGender()))
//            newUser.setPictureurl("https://randomuser.me/api/portraits/women/" + new Random().nextInt(100) + ".jpg");
//        else if ("male".equals(newUser.getGender()))
//            newUser.setPictureurl("https://randomuser.me/api/portraits/men/" + new Random().nextInt(100) + ".jpg");
//        else
//            newUser.setPictureurl("https://randomuser.me/api/portraits/men/" + new Random().nextInt(100) + ".jpg");
                    return userRepository.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));
    }

    public String deleteUser(Long id){
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id "+id +" has been Deleted Successfully!!";
    }


}
