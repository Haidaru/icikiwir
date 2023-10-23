package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();
    private long userIdCounter = 1;

    public List<User> getALlUsers(){
        return users;
    }

    public User addUser(User user){
        user.setId(userIdCounter++);
        users.add(user);
        return user;
    }

    public User getUserById(Long id){
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User updateUser(Long id, User updatedUser){
        users = users.stream()
                .map(user -> user.getId().equals(id) ? updatedUser : user)
                .toList();
        return updatedUser;
    }

    public void deleteUser(Long id){
        users.removeIf(user -> user.getId().equals(id));
    }

}
