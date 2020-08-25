package com.poc.playbook.kafka.consumer.service;


import com.poc.playbook.kafka.consumer.model.Account;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {


    @KafkaListener(topics = "kafka_poc", groupId = "group_json", containerFactory = "accountKafkaListenerFactory")
    public void consumeJson(Account account) {
        System.out.println("Consumed JSON Message: " + account);
    }
}
