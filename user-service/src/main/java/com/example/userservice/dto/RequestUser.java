package com.example.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

@Data
public class RequestUser {
    @NotNull(message = "이메일은 공백일 수 없습니다.")
    @Size(min = 2, message = "이메일은 최소 2글자 이상 이어야합니다.")
    @Email
    private String email;

    @Size(min = 5, message = "비밀번호는 최소 5글자 이상 이어야합니다.")
    @NotNull(message = "비밀번호는 공백일 수 없습니다.")
    private String pwd;

    @NotNull(message = "이름은 공백일 수 없습니다.")
    @Size(min = 2, message = "이름은 최소 2글자 이상 이어야합니다.")
    private String name;


}
