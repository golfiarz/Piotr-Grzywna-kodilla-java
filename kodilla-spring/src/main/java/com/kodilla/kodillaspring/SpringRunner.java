package com.kodilla.kodillaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringRunner.class, args);

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		System.out.println("\n\n");
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		System.out.println("\n\n");
	}
}