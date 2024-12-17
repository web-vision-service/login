package com.example.userservice.service;
import com.example.userservice.dto.ResponseUser;
import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.UserEntity;
import com.example.userservice.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    public ResponseUser createUser(UserDto userDto){

        userDto.setUserId(UUID.randomUUID().toString());

        UserEntity userEntity = new UserEntity(userDto);

        userEntity.setEncryptedPwd("encrypted_password");

        UserEntity savedUser = userRepository.save(userEntity);

        return new ResponseUser(savedUser);



    }
}
