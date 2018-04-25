package com.example.demo.controller;

import com.example.demo.base.BaseResponse;
import com.example.demo.entity.User;
import com.example.demo.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-25 10:49
 */
@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    IuserService userSerivce;
    @RequestMapping("/test")
    public BaseResponse test() {
        return new BaseResponse();
    }

    /**
     * 添加用户
     */
    @PostMapping("/")
    public BaseResponse saveUser(@RequestBody User user) {
        userSerivce.save(user);
        return new BaseResponse();
    }

    /**
     * 更新用户信息
     */
    @PutMapping("/")
    public BaseResponse updateUserById(@RequestBody User user) {
        userSerivce.save(user);
        return new BaseResponse();
    }

    /**
     * 获取用户信息
     */
    @GetMapping("/{id}")
    public BaseResponse findUserById(@PathVariable Long id) {
        User user = userSerivce.findOne(id);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResult(user);
        return baseResponse;
    }

    /**
     * 删除用户信息
     */
    @DeleteMapping("/{id}")
    public BaseResponse deleteUserById(@PathVariable Long id) {
        userSerivce.delete(id);
        return new BaseResponse();
    }

}
