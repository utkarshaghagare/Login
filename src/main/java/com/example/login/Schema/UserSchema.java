package com.example.login.Schema;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat
public class UserSchema {
    @JsonProperty
    public String user_name;

  
    @JsonProperty
    public String password;

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

}


