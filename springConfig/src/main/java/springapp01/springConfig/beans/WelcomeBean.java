package springapp01.springConfig.beans;

public class WelcomeBean {
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WelcomeBean(){
		System.out.println("Welcome Guest:");
	}
	
	public WelcomeBean(String name){
		this.name = name;
		System.out.println("Welcome :"+ name );
	}
	
	static {
		System.out.println("Loading Welcome Bean");
	}
}
