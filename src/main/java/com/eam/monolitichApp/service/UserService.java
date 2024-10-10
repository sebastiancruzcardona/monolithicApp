package com.eam.monolitichApp.service;

import com.eam.monolitichApp.model.User;
import com.eam.monolitichApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<User> findUser(String userNameOrEmail, String password) {
        Optional<User> user = userRepository.findByUserNameOrEmail(userNameOrEmail, userNameOrEmail);
        if(user.isPresent()){
            User userValidate = user.get();
            if(userValidate.getPassword().equals(password)){
                return user;
            }
        }
        return Optional.empty();
    }

}
