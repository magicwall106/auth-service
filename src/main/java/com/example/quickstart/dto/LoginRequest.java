package com.example.quickstart.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author tuong.le on 4/26/17.
 */
public class LoginRequest {

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    public LoginRequest() {
        //empty constructor
    }

    public LoginRequest(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}
