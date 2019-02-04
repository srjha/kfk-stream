package com.sr.practice.kafka.kfkstream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@Value("${spring.kafka.consumer.group-id}")
	private static final String consumerGrpId = "test-kafka1";

	@KafkaListener(topics = Producer.TEST_TOPIC_1, groupId = consumerGrpId)
	public void consume(String msgRecvd) {

		System.out.println("Received message [" + msgRecvd + "]");
	}

}
