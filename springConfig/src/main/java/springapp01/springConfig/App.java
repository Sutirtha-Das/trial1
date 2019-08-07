package springapp01.springConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springapp01.springConfig.beans.WelcomeBean;
import springapp01.springConfig.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	WelcomeBean welcomeBean = (WelcomeBean)context.getBean("welcomeBean");
    	System.out.println(welcomeBean);
        System.out.println( "Hello World!" );
    }
}
