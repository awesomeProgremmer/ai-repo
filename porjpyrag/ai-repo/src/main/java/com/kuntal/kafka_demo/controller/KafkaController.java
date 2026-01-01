package com.kuntal.kafka_demo.controller;

import com.kuntal.kafka_demo.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private KafkaProducer producer;

    @GetMapping("/publish/{message}")
    public ResponseEntity<String> publish(@PathVariable String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka topic");
    }
}
