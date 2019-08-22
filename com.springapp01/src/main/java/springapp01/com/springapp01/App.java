package springapp01.com.springapp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springapp01.com.springapp01.bean.FirstBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	FirstBean fB = (FirstBean)context.getBean("firstBean");
    	fB.sayHello();
        System.out.println( "Hello World!" );
    }
}
