package com.thoughtworks;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {

	@Autowired
	HelloWorldController subject;
	
	@Test
	public void shouldEchoHelloWorld() {
		String expected = "Hello World";
		String actual = subject.helloWorld();
		
		assertEquals(expected, actual);
	}

}
