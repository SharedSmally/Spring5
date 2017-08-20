package com.jpw.springex.base.ex05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
	static final Logger logger = LoggerFactory.getLogger(MainApp.class);
	
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        
    	HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
    	String msg = helloSpring.getMessage();
    	
    	logger.info( "HelloSpring::getMessage(): message="+ msg);
    }
}