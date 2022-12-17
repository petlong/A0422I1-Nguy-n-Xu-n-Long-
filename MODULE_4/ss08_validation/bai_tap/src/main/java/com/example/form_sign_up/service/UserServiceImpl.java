package com.example.form_sign_up.service;

import com.example.form_sign_up.model.User;
import com.example.form_sign_up.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public void create(User user) {
        iUserRepository.save(user);
    }
}




