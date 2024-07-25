package com.example.summer_comming.user;

import org.springframework.stereotype.Component;

@Component
public class AuthService {
    UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse login(String id, String password) {
        User user = userRepository.getUser(id);
        if(user == null) return null;
        if(user.getPassword().equals(password)){
            return new UserResponse(user.id,user.name);
        }
        else return null;
    }
    public void register(User user) {
        userRepository.saveUser(user);
    }
}
