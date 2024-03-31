package com.msllemes.exerapplication.service.user;

import lombok.Data;

@Data
public class CreateUserRequest {
    public String userName;
    public String userEmail;
    public String userPassword;
}
