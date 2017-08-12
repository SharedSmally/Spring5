package com.jpw.springex.ch01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	final static Logger logger = LoggerFactory.getLogger(MainApp .class);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
		String msg = obj.getMessage();
		logger.info("MainApp: getMessage="+msg);
	}

}
