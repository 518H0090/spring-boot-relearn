package com.trunghieu.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(ExampleApplication.class, args);

//		MyFirstClass myFirstClass = context.getBean(MyFirstClass.class);
//		MyFirstClass myFirstClass = context.getBean("custom_first_class", MyFirstClass.class);

		MyFirstService myFirstService = context.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
	}

}
