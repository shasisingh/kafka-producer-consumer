package com.poc.playbook.kafka.producer.service;


import com.poc.playbook.kafka.producer.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("kafka-producer")
public class AccountResource {

    private static final String TOPIC = "kafka_poc";
    private final KafkaTemplate<String, Account> kafkaTemplate;

    @Autowired
    public AccountResource(KafkaTemplate<String, Account> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/publish/{accountId}")
    public String post(@PathVariable("accountId") final String accountId) {

        kafkaTemplate.send(TOPIC, new Account(accountId, "BICXXXXX", "eur", "sdd", "000001", "IBAN"));

        return "Published successfully for account - >" + accountId;
    }

    @Scheduled(cron = "0 0 * ? * *")
    public void postRandomData(){
        String uuid = UUID.randomUUID().toString();
        kafkaTemplate.send(TOPIC, new Account(uuid, "BICXXXXX", "eur", "sdd", "000001", "IBAN"));
    }

}
