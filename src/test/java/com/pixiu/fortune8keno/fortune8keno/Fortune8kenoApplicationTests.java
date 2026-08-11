package com.pixiu.fortune8keno.fortune8keno;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAsync
class Fortune8kenoApplicationTests {
	public static void main(String[] args) {
		SpringApplication.run(Fortune8kenoApplicationTests.class, args);
	}

	@Bean
	RestTemplate restTemplateBean(){
		SimpleClientHttpRequestFactory clientHttpRequestFactory  = new SimpleClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(1000);
		clientHttpRequestFactory.setReadTimeout(1000);

		return new RestTemplate(clientHttpRequestFactory);
	}

	@Test
	void contextLoads() {
	}

}
