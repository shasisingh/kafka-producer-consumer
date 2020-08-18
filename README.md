# Spring Boot with Kafka Producer and Consumer Example

This Project covers how to use Spring Boot with Spring Kafka to Publish JSON/String message to a Kafka topic and consume
## Start Zookeeper
- `bin/zookeeper-server-start.sh com.poc.playbook.kafka.consumer.config/zookeeper.properties`

## Start Kafka Server
- `bin/kafka-server-start.sh com.poc.playbook.kafka.consumer.config/server.properties`

## Create Kafka Topic
- `bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka_poc`

## Consume from the Kafka Topic via Console
- `bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic kafka_poc --from-beginning`

## Publish message via WebService
- `http://localhost:8081/kafka-producer/publish/NL01`
- `http://localhost:8081/kafka-producer/publish/NL02`

## kafka-producer-consumer
- `coming soon`
## Homebrew 
- `brew install kafka`
- `brew services start zookeeper`
- `brew services start kafka`

## create a topic
- `kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka_poc`

## Initialize Producer console:
- `kafka-console-producer --broker-list localhost:9092 --topic kafka_poc`

## Initialize Consumer console:
- `kafka-console-consumer --bootstrap-server localhost:9092 --topic kafka_poc --from-beginning`
