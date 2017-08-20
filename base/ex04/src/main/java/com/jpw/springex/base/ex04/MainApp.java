package com.jpw.springex.base.ex04;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
	static final Logger logger = LogManager.getLogger(MainApp.class);
	
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        
    	HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
    	String msg = helloSpring.getMessage();
    	
    	logger.info( "HelloSpring::getMessage(): message="+ msg);
    }
}