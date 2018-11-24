package com.itheima.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

@Component
public class TopicProducer {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    @Qualifier("topicTextDestination")
    private Destination destination;
    public void sendTextMessage(String text){
        jmsTemplate.convertAndSend(destination,text);
    }

}
