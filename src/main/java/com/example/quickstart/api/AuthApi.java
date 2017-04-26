package com.example.quickstart.api;

import com.example.quickstart.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tuong.le on 4/26/17.
 */

@RestController
@RequestMapping(value = "/auth")
public class AuthApi {
    private final UserService userService;

    public AuthApi(final UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/token", method = RequestMethod.GET)
    public ResponseEntity token() {
        return new ResponseEntity<>(userService.getToken("admin", "password"), HttpStatus.OK);
    }
}
