package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.Login;
import org.example.entity.LoginEntity;
import org.example.repository.LoginRepository;
import org.example.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
@Slf4j
public class LoginServiceImpl implements LoginService {
    final LoginRepository repository;
    final ModelMapper mapper;
    @Override
    public void insertLoginData(Login login) {
        LoginEntity map = mapper.map(login, LoginEntity.class);
        repository.save(map);
    }

    @Override
    public Boolean validateLogin(Login login) {
        log.info(login.toString());
        return repository.existsByEmailAndPassword(login.getEmail() ,login.getPassword());
    }
}
