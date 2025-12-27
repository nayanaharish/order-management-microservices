package com.ordermanagement.userservice.service;

import com.ordermanagement.userservice.entity.User;
import com.ordermanagement.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User saveUser(User user) {
        User userData = userRepository.save(user);
        return userData;

    }

    public List<User> getAllUsers() {
        List<User> allUsers = userRepository.findAll();
        return allUsers;

    }

    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            return null;
        }

    }

    //delete user by id

    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "deleted successfully";
    }
}

