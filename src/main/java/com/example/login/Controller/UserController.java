package com.example.login.Controller;

import ch.qos.logback.core.model.Model;
import com.example.login.Schema.DisplayOp;
import com.example.login.Schema.UserSchema;
import com.example.login.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.validation.Schema;

@Controller
public class UserController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
@Autowired
public UserService userService;

    @PostMapping("/login")
    public String pass(@RequestParam("username") String username,
                       @RequestParam("password") String password){

        return userService.saveUser(username, password);
    }

//    public DisplayOp createUser(@RequestBody UserSchema request) {
//        // Receive user data from the request body and pass it to the service
//        //String x=request.getUser_name();
//
//        return userService.saveUser(request);
//                //ResponseEntity.ok("User created successfully!");
//    }

}
