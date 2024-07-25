package com.example.summer_comming.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public UserResponse login(@RequestBody User user) {
        UserResponse loginedUser = authService.login(user.id, user.password);
        System.out.println(loginedUser);
        return loginedUser;
    }

    @RequestMapping(value = "/auth/register", method = RequestMethod.POST)
    public String register(@RequestBody User user) {
        authService.register(user);
        return "Success";
    }

}
