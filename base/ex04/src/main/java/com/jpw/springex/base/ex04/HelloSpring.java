package com.jpw.springex.base.ex04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloSpring 
{
	static final Logger logger = LogManager.getLogger(HelloSpring.class);
		
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
