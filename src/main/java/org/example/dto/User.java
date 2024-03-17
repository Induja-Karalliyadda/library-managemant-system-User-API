package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String address;
    private String address2;
    private String country;
    private String phoneNumber;

}
