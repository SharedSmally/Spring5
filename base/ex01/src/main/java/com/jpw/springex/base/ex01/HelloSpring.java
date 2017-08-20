package com.jpw.springex.base.ex01;

public class HelloSpring 
{
	public HelloSpring()
	{
		System.out.println( "HelloSpring::HelloSpring" );
	}
	
	String message;

	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) 
	{
		System.out.println( "HelloSpring::setMessage(): message="+message );
		this.message = message;
	}
}
