package com.example.demo.receive;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/12.
 */
@Component
public class Receiver {

    @JmsListener(destination = "myMessage")
    public void receiveMessage(String message){
        System.out.println("receive message:"+message);
    }
}
