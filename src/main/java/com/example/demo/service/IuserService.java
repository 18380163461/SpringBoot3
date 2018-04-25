package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-25 19:59
 */
public interface IuserService {
    List<User> findAll();

    Long save(User user);

    User findOne(Long id);

    void delete(Long id);
}
