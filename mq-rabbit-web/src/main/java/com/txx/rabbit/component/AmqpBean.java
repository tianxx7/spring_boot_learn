package com.txx.rabbit.component;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/16
 */
@Component
public class AmqpBean {
    private final AmqpAdmin amqpAdmin;
    private final AmqpTemplate amqpTemplate;

    @Autowired
    public AmqpBean(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
        this.amqpAdmin = amqpAdmin;
        this.amqpTemplate = amqpTemplate;
    }

    public AmqpAdmin getAmqpAdmin() {
        return amqpAdmin;
    }

    public AmqpTemplate getAmqpTemplate() {
        return amqpTemplate;
    }
}
