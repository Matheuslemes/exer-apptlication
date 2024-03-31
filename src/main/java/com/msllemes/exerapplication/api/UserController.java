package com.msllemes.exerapplication.api;

import com.msllemes.exerapplication.service.user.CreateUserRequest;
import com.msllemes.exerapplication.service.user.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserServiceInterface userService;
    @PostMapping()
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest request) {
        var response = userService.createUser(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
