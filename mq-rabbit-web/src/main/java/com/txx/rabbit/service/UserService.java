package com.txx.rabbit.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.txx.rabbit.bean.User;
import com.txx.rabbit.mapper.UserMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/16
 */
@Service
public class UserService {

    private static ObjectMapper objectMapper = new ObjectMapper();
    @Resource
    private UserMapper mapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public int saveUser(User user) throws JsonProcessingException {
        rabbitTemplate.convertAndSend("txx-queue", objectMapper.writeValueAsString(user));
        return 0;
    }

}
