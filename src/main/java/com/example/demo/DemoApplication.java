package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.Properties;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		// 获取所有环境变量
		Map<String, String> envVariables = System.getenv();
		for (Map.Entry<String, String> entry : envVariables.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			LOGGER.info(key + " = " + value);
		}

		// 获取特定环境变量
		String path = System.getenv("PATH");
		LOGGER.info("======================");
		LOGGER.info("======================");
		LOGGER.info("======================");
		LOGGER.info("======================");

		Properties properties = System.getProperties();
		properties.forEach((k, v) -> {
			LOGGER.info(k + " = " + v);
		});

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
