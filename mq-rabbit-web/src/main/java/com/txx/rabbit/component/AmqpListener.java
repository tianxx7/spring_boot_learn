package com.txx.rabbit.component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.txx.rabbit.bean.User;
import com.txx.rabbit.mapper.UserMapper;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/16
 */
@Component
public class AmqpListener {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Resource
    private UserMapper userMapper;

    /**
     * 这个注解可以放类上 配合@RabbitHandler注解
     * 默认是持久化  非独占  不是自动删除队列
     *
     * @param content
     */
    @RabbitListener(queuesToDeclare = @Queue(value = "txx-queue", durable = "false", autoDelete = "true"))
    public void processMessage(String content) throws JsonProcessingException {
        System.out.println("listener content");
        System.out.println(content);
        userMapper.saveUser(objectMapper.readValue(content, User.class));
    }
}
