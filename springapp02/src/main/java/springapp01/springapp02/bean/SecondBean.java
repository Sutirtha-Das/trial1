package springapp01.springapp02.bean;

public class SecondBean {
	private String name;
	
	
	static {
		System.out.println("Loading bean ");
	}
	
	public SecondBean(){
		System.out.println("Name is initialized to:"+getName());
	}
	public void sayHello(){
		System.out.println("Hello "+ getName() +"!!. This is my second bean");
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
}
