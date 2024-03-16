package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public List<UserEntity> getAllUsers(){
        return  repository.findAll();
    }

    @Override
    public void addUser(User user) {
        UserEntity entity = mapper.map(user, UserEntity.class);
        repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User findByUserName(String UserName) {
        return mapper.map(repository.findByUserName(UserName), User.class);
    }

    @Override
    public boolean isExsistUser(String userName) {
        return repository.existsByUserName(userName);
    }
}
