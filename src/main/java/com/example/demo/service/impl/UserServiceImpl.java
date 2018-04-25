package com.example.demo.service.impl;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-25 11:00
 */
@Service
public class UserServiceImpl implements IuserService {
    @Autowired
    UserRepository repository;


    @Override
    public Long save(User user) {
        return repository.save(user).getId();
    }

    @Override
    public User findOne(Long id) {
        Optional<User> optional = repository.findById(id);
        User user = optional.get();
        return user;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }
}
