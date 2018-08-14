package com.pug;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pug.mq.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

	@Autowired
	private Sender sender;
	
	@Test
	public void contextLoads() throws InterruptedException {
		boolean flag = true;
		while (flag) {
			Thread.sleep(2000);
			sender.send("hello world"); 			
		}
	}

}
