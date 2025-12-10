package com.kuntal.kafka_demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic createTopic() {
        return new NewTopic("javatechie-avro", 3, (short) 1);
    }
}
