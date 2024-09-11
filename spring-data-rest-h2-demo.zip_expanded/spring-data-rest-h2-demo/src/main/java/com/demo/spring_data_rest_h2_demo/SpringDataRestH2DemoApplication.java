package com.demo.spring_data_rest_h2_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringDataRestH2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestH2DemoApplication.class, args);
		Logger logger = LoggerFactory.getLogger(SpringDataRestH2DemoApplication.class);
		logger.info("heelo this is log!!");
	}

}
