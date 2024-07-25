package com.example.summer_comming.user;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {

    Map<Long, User> users = new HashMap<>();
    private Long idx;

    public UserRepository() {
        idx = 0L;
    }

    public void saveUser(User user){
        users.put(idx++, user);
        System.out.println("succes to save"+user);
    }

    public User getUser(String id){
        for (Long key : users.keySet()) {
            // grade.get(key) = value 값 d
            if (users.get(key).id.equals(id)) {
                System.out.println("찾은유저 : " + key);
                return users.get(key);
            }
        }
        return null;
    }
}
