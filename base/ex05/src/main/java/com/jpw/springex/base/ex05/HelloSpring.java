package com.jpw.springex.base.ex05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSpring 
{
	static final Logger logger = LoggerFactory.getLogger(HelloSpring.class);
	public HelloSpring()
	{
		logger.info( "HelloSpring::HelloSpring" );
	}
	
	String message;

	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) 
	{
		logger.info( "HelloSpring::setMessage(): message="+message );
		this.message = message;
	}
}
