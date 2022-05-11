package com.ggingmin.kafkasampleapp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListners {

    @KafkaListener(
            topics = "ggingmin",
            groupId = "com.ggingmin"
    )
    void Listener(String data) {
        System.out.println("Kafka Listner received: " + data);
    }
}
