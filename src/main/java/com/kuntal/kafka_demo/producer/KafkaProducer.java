package com.kuntal.kafka_demo.producer;

import com.kuntal.kafka_demo.consumer.KafkaConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {


    private static final org.slf4j.Logger log2 = org.slf4j.LoggerFactory.getLogger(KafkaConsumer.class);


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {

        kafkaTemplate.send("javatechie-avro", message);

        log2.info("message  send to topic by Producer:{}" , message);

    }
}
