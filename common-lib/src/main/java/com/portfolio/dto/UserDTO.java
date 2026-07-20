package com.portfolio.dto;

import com.portfolio.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private UserRole role;
}
