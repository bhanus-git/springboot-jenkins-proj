package com.example.springboot_jenkins_proj;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootJenkinsProjApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsProjApplication.class);

	@Test
	 contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true,true);
	}

}
