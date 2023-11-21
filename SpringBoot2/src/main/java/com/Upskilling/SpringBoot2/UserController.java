package com.Upskilling.SpringBoot2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

    @PostMapping("/login")

    public String authenticateUser(@RequestBody User user){

        if ("correctUsername" .equals(user.getUsername()) && "correctPassword".equals(user.getPassword())){
            return "Valid user";
        }
        else{
            return "Invalid user";
        }
    }
}
