package com.esprit.kafkaproducer;

import com.esprit.kafkaproducer.entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducer {

    private static final String TOPIC="groot_topic";

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void writeMessage(Message msg){
        this.kafkaTemplate.send(TOPIC,msg);
    }
}
