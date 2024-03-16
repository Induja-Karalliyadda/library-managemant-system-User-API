package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    final UserService service;
    @GetMapping("/get-all-users")
    public List<UserEntity> getAllUser(){
    return service.getAllUsers();
    }
    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteById(id);
    }
    @GetMapping("find-by-user-name/{userName}")
    public User findByUserName(@PathVariable String userName){
        return service.findByUserName(userName);
    }
    @GetMapping("/is-Exsist-User/{userName}")
    public Boolean isExsistUser(@PathVariable String userName){
       return service.isExsistUser(userName);
    }
}
