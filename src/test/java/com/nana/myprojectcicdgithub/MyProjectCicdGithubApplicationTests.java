package com.nana.myprojectcicdgithub;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyProjectCicdGithubApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testApp() {
		MyProjectCicdGithubApplication myApp = new MyProjectCicdGithubApplication();

		String result = myApp.getStatus();

		assertEquals("OK", result);
	}

}
