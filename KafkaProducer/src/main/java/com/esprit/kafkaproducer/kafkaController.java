package com.esprit.kafkaproducer;

import com.esprit.kafkaproducer.entities.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kafkaController {

    private final kafkaProducer producer;

    public kafkaController(kafkaProducer producer){
        this.producer = producer;

    }

    @PostMapping("/send")
    public void writeMessageToTopic(@RequestBody Message message){
        this.producer.writeMessage(message);
    }

}
