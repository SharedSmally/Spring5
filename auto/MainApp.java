package %NAMESPACE%;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        
    	HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
    	String msg = helloSpring.getMessage();
    	
    	System.out.println( "HelloSpring::getMessage(): message="+ msg);
    }
}