package com.example.userservice.dto;

import com.example.userservice.entity.UserEntity;
import lombok.Data;

@Data
public class ResponseUser {
    private String email;
    private String name;
    private String userId;

    public ResponseUser(UserEntity savedUser) {
        this.email = savedUser.getEmail();
        this.name = savedUser.getName();
        this.userId = savedUser.getUserId();
    }
}
