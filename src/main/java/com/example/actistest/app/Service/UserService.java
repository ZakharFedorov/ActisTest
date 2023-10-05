package com.example.actistest.app.Service;

import com.example.actistest.app.Entity.User;
import com.example.actistest.app.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean addUser(String email, int phone_number, double height) {
        User user = new User();
        user.setEmail(email);
        user.setPhone_number(phone_number);
        user.setHeight(height);

        if(userRepository.existsByEmail(email)){
            return false;
        }
        userRepository.save(user);
        return true;
    }

    public User findById(int userId) {
        return userRepository.findById(userId);
    }

    public Collection<? extends User> findAll() {
        return userRepository.findAll();
    }
}
