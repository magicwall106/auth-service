package com.example.quickstart.client;

import com.example.quickstart.dto.LoginRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @author tuong.le on 4/26/17.
 */
@Component
public class UserClientFallbackImpl implements UserClient {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UserClientFallbackImpl.class);
    @Override
    public Map<String, String> getToken(@RequestBody final LoginRequest loginRequest) {
        LOGGER.error("Could not get token with userName: {}", loginRequest.getUsername());
        return null;
    }
}
