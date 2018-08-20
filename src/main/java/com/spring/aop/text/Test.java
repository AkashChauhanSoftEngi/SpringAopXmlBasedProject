package com.spring.aop.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.concert.Performance;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "Spring-Config.xml" });
		
		Performance performance = (Performance) appContext.getBean("performance");
		performance.perform();
		try {
			performance.perform(2);
		} catch (Exception e) {
			System.out.println("Exception_Occured!");
		}
		appContext.getClass();
	}
}
