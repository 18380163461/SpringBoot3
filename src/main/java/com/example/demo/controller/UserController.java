package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.base.BaseResponse;
import com.example.demo.entity.User;
import com.example.demo.service.IuserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-25 19:49
 */
@RequestMapping("/users")
@RestController
public class UserController {
    static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    IuserService userSerivce;

    @RequestMapping("/test")
    public BaseResponse test() {
        return new BaseResponse();
    }

    /**
     * 查询所有
     *
     */
    @GetMapping("/")
    public BaseResponse gatAll() {
        List<User> users = userSerivce.findAll();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResult(users);
        logger.error(JSONObject.toJSON(baseResponse).toString());
        return baseResponse;
    }

    /**
     * 获取某个用户信息
     *
     */
    @GetMapping("/{id}")
    public BaseResponse findUserById(@PathVariable Long id) {
        User user = userSerivce.findOne(id);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResult(user);
        logger.error(JSONObject.toJSON(baseResponse).toString());
        return baseResponse;
    }

    /**
     * 添加用户
     * body：  {"age": "18","name": "DDDDD"}
     */
    @PostMapping("/")
    public BaseResponse saveUser(@RequestBody User user) {
        userSerivce.save(user);
        return new BaseResponse();
    }

    /**
     * 更新用户信息
     *       {"id":"5","name": "UPDATE"}
     */
    @PutMapping("/")
    public BaseResponse updateUserById(@RequestBody User user) {
        userSerivce.save(user);
        return new BaseResponse();
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
