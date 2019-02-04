package com.sr.practice.kafka.kfkstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishController {

	@Autowired
	private Producer msgProducer;

	// Should be POST, but for easy testing via browser having it as GET
	@GetMapping("/test/publish")
	public void publish(@RequestParam String msg) {
		msgProducer.senMessage(msg);

	}

}
