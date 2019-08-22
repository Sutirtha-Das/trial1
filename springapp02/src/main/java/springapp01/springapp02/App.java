package springapp01.springapp02;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springapp01.springapp02.bean.FifthBean;
import springapp01.springapp02.bean.SecondBean;
import springapp01.springapp02.bean.SixthBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring.xml");
    	SecondBean sB = (SecondBean) context.getBean("secondBean");
    	System.out.println("Main Thread:"+sB);
    	
        SecondBean sBName = (SecondBean) context.getBean("secondBeanName");
        System.out.println("Main Thread:"+sBName);
        
        FifthBean fifthBean = (FifthBean)context.getBean("fifthBean");
		fifthBean.printMessage();
		
		 SixthBean sixthBean = (SixthBean)context.getBean("sixthBean");
		 sixthBean.printMessage();
        Runnable r = new Runnable() {
			
			@Override
			public void run() {
				SecondBean sBRunnabe = (SecondBean)context.getBean("secondBean");
				System.out.println("User Thread:"+ sBRunnabe);
				/*
				 * This creates a new Object for each thread or method
				 * which requests for the bean
				 */
				
			}
		};
    	
		for(int i=0;i<=2;i++){
		Thread t1 = new Thread(r);
		t1.start();
		}
		
		
    	/*
    	 * The same bean can be referred by using different bean values
    	 * as specified in the configuration metadata
    	 * SecondBean sB = (SecondBean) context.getBean("secondBean1");
    	sB.sayHello();
        System.out.println( "Hello World!" );
        
        SecondBean sB2 = (SecondBean) context.getBean("secondBean2");
    	sB.sayHello();
        System.out.println( "Hello World!" );*/
        
        
    	/*Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'secondBean1' available
        ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring.xml");
    	SecondBean sB = (SecondBean) context.getBean("secondBean1");
    	sB.sayHello();
        System.out.println( "Hello World!" );*/
		
		
		
		
    }
}
