package org.example.service;

import org.example.dto.Login;
import org.example.dto.User;
import org.example.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();

    void addUser(User user);

    void deleteById(Long id);
    User findByUserName(String UserName);

    boolean isExsistUser(String userName);

    interface LoginService {
        void insertLoginData(Login login);

    }
}
