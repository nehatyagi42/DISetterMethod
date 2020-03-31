package com.rtpl.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rtpls.output.OutputHelper;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	        output.generateOutput();
	}
}
