package com.d2cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DnsApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(DnsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DnsApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		String url = "http://example.com";
		
		RestTemplate restClient = new RestTemplate();
		String str = restClient.getForObject(url, String.class);
		
		log.info("hello scott:" + str);
		
	}
}
