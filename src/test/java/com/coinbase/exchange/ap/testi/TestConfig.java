package com.coinbase.exchange.ap.testi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan({ "com.coinbase.exchange.api" })
@PropertySource("classpath:application-test.properties")
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public class TestConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
