package com.txx.rabbit.service;


import com.txx.rabbit.MqRabbitWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/16
 */
@SpringBootTest(classes = MqRabbitWebApplication.class)
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testMq() {
        rabbitTemplate.convertAndSend("txx-queue", "xingxing love skye");
    }


}