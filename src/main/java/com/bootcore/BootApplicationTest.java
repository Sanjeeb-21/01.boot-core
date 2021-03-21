package com.bootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootcore.beans.Radio;

@SpringBootApplication //it hold the Three Annotation i.e @Configuration, @EnableAutoConfiguration, @ComponentScan 
public class BootApplicationTest {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(BootApplicationTest.class, args);
		
		Radio radio=context.getBean(Radio.class);
		radio.listen(93.5f);
		System.out.println(radio);
	}

}
