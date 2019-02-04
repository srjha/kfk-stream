package com.sr.practice.kafka.kfkstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class Producer {

	public static final String TEST_TOPIC_1 = "test-topic-1";
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void senMessage(String msg) {
		ListenableFuture<SendResult<String, String>> sent = kafkaTemplate.send(TEST_TOPIC_1, msg);

		ListenableFutureCallback<SendResult<String, String>> callback = new ListenableFutureCallback<SendResult<String, String>>() {

			@Override
			public void onFailure(Throwable ex) {
				System.err.println("Message not published");

			}

			@Override
			public void onSuccess(SendResult<String, String> result) {
				System.out.println("Message is published");
			}
		};
		sent.addCallback(callback);
	}

}
