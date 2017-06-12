package com.example.demo.send;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Msg implements MessageCreator {
    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("it is test message!");
    }
}
