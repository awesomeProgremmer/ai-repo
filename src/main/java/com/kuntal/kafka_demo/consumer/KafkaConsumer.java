package com.kuntal.kafka_demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    private static final org.slf4j.Logger log1 = org.slf4j.LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "${app.kafka.topic}", groupId = "group_id")
    public void consume(String message) {

        System.out.println("Consumer Received message: " + message);


        log1.info("message  Received  by Consumer:{}" , message);
    }
}
