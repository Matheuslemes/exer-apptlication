package com.msllemes.exerapplication.service.user;

import com.msllemes.exerapplication.entities.UserProfile;
import com.msllemes.exerapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;
    public String createUser(CreateUserRequest request) {
        var user = new UserProfile(request.userName, request.userEmail, request.userPassword);

        userRepository.save(user);

        return user.getUserId().toString();
    }
}
