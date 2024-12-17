package com.example.userservice.dto;

import com.example.userservice.entity.UserEntity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    private String email;

    private String name;

    private String pwd;

    private String userId;

    private LocalDateTime createdAt;

    private String encryptedPwd;

    public UserDto(RequestUser requestUser) {
        this.email = requestUser.getEmail();
        this.pwd = requestUser.getPwd();
        this.name = requestUser.getName();
    }
}
