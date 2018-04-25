package com.example.demo.service;

import com.example.demo.entity.User;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-25 10:59
 */
public interface IuserService {
    Long save(User user);

    User findOne(Long id);

    void delete(Long id);
}
