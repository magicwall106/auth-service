package com.example.quickstart.service;

import com.example.quickstart.client.UserClient;
import com.example.quickstart.dto.LoginRequest;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author tuong.le on 4/26/17.
 */

@Service
public class UserService {

    private final UserClient userClient;

    public UserService(final UserClient userClient) {
        this.userClient = userClient;
    }

    public Map<String, String> getToken(final String username, final String password) {
        //final UserEntity userEntity;
        return userClient.getToken(new LoginRequest(username, password));
    }
}
