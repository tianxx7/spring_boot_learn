package com.txx.rabbit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.txx.rabbit.bean.User;
import com.txx.rabbit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/16
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/save/user")
    public int put() throws JsonProcessingException {
        final User user = new User();
        user.setMobile("18351801500");
        user.setPassword("123456");
        return userService.saveUser(user);
    }
}
