package com.example.eventra;

public class LoginHandler {

    final String CORRECT_USERNAME = "admin";
    final String CORRECT_PASSWORD = "123";
    public boolean isUserAvailable(String inputUserName, String inputPassword){
        boolean userAvailability = false;
        if(inputUserName == CORRECT_USERNAME && inputPassword == CORRECT_PASSWORD){
            userAvailability = true;
        }
        return userAvailability;

    }
}
