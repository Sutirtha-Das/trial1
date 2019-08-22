package springapp01.springapp02.bean;

public class FifthBean {
	
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
	
	public void init(){
		System.out.println("Initialization of the Bean");
		name = "Sunand";
		message = "Happy Holidays";
	}
	
	public void destroy(){
		System.out.println("Destroying the bean");
		this.name="";
		this.message="";
		
	}

}
