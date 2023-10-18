package com.Fullstackwebapp.Fullstackwebapp1.exception;

public class UserNotFoundException extends  RuntimeException{
    public UserNotFoundException(Long id){
        super("Couldn't Found the User with Id " + id);
    }
    public UserNotFoundException(int id){
        super("Couldn't Found the User with Id " + id);
    }

}
