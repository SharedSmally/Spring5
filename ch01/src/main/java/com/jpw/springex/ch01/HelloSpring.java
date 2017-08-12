package com.jpw.springex.ch01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSpring {

	final static Logger logger = LoggerFactory.getLogger(HelloSpring .class);
	
	public String getMessage() {
		logger.info("HelloSpring::getMessage");
		return message;
	}

	public void setMessage(String message) {
		logger.info("HelloSpring::setMessage:message="+message);
		this.message = message;
	}

	String message;
}
