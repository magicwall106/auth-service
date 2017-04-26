package com.example.quickstart.client;

import com.example.quickstart.dto.LoginRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author tuong.le on 4/26/17.
 */
@FeignClient(value = "users", url = "${feign.url}", fallback = UserClientFallbackImpl.class)
public interface UserClient {
    String GET_TOKEN_URL = "/login";
    
    @RequestMapping(value = GET_TOKEN_URL, method = RequestMethod.POST,
            produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    Map<String, String> getToken(@RequestBody LoginRequest loginRequest); 
}
