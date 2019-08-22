package springapp01.springapp02.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Sutirtha
 * This bean initializes bean by implementing InitializingBean
 * Destroys bean by implementing DisposableBean
 */
public class SixthBean implements InitializingBean,DisposableBean{

	
	private String name;
	private String message;
	
	static{
		System.out.println("Loading Fifth Bean");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage(){
		System.out.println("Hello "+name+"!!" + message);
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Calling destroy method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean through afterPropertiesSet");
		name="RN Das";
		message="How are you";
		
	}

}
