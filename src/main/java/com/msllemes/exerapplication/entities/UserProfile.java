package com.msllemes.exerapplication.entities;

import java.util.UUID;

public class UserProfile {
    private UUID userId;
    private String userName;
    private String userEmail;
    private String userPassword;

    public UserProfile(String userName, String userEmail, String userPassword) {
        this.setUserId();
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    protected void setUserId() {
        this.userId = UUID.randomUUID();
    }

    public UUID getUserId() {
        return this.userId;
    }
}
