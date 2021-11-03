package com.dio.ansi.service;

import com.dio.ansi.exception.UserNotFoundException;
import com.dio.ansi.model.User;
import com.dio.ansi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long idUser) {
        userRepository.deleteById(idUser);
    }

    public User findById(Long idUser) {
        return userRepository.findById(idUser).orElseThrow(() -> new UserNotFoundException(idUser));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
