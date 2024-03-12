package com.esprit.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {

    @KafkaListener(topics = "groot_topic", groupId = "beep_group")
    public void getMessage(String message){
        System.out.println(message);
    }
}
