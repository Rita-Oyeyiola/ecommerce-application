package com.septa.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.septa.Ecommerce.model.User;
import org.springframework.stereotype.Service;
import com.septa.Ecommerce.repository.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long userid) {
        return userRepository.findById(userid);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

}
