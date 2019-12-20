package com.varun.secure.security_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by varun on 12/18/2019.
 */
@RestController

public class WelcomeController {
    @GetMapping("/")
    public String message(){
        return "<h1>Hello Everybody ! ! ! </h1>" ;
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>Hello Users ! ! ! </h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1>Hello Admins ! ! ! </h1>";
    }
}
