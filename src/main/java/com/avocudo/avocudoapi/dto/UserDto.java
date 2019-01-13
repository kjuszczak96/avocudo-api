package com.avocudo.avocudoapi.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserDto {
    @NotNull
    @NotEmpty
    private String username;
     
    @NotNull
    @NotEmpty
    private String password;
     
    private String avatarUrl;
}