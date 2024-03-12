package com.esprit.kafkaproducer.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;


@Getter
@Setter
public class Message {
    private int id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timestamp;
    private String content;

    public int randomId(){
        int parsedIntId;
        String uuidString = UUID.randomUUID().toString();
        String numericalSubstring = uuidString.substring(0, 3);
       return parsedIntId = Integer.parseInt(numericalSubstring, 16);
    }

    public Message() {
        this.id = randomId();
        this.timestamp = LocalDateTime.now();
        this.content = content;
    }
}
