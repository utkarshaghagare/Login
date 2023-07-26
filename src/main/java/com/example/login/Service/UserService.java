package com.example.login.Service;

import com.example.login.Schema.DisplayOp;
import com.example.login.Schema.UserSchema;
import com.example.login.entity.User;
import com.example.login.repo.UserRepositary;
import org.aspectj.bridge.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public UserRepositary userRepositary;


    public String checkUser(String username_req, String password_req) {

       // DisplayOp op = new DisplayOp();
//          String username_req = user_req.getUser_name();
//          String password_req = user_req.getPassword();

          User user = userRepositary.findByUsername( username_req );

        if (user ==null) {
            return "NotFound";
        }
        else{
            if (user.getPassword().equals(password_req)) {
                return "Found";
            } else {
                return "NotFound";
            }
        }
    }
    public String saveUser(String username_req, String password_req){
        User user = new User();
        user.setUsername(username_req);
        user.setPassword(password_req);
        userRepositary.save(user);
        return "registered";
    }

}
