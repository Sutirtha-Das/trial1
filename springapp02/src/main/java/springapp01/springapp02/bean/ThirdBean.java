package springapp01.springapp02.bean;

public class ThirdBean {
	
	private String name;

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
	
	static{
		System.out.println("Loading ThirdBean class");
	}
	public static ThirdBean createInstance(){
		System.out.println("Instantiating ThirdBean class from static factory");
		return new ThirdBean();
	}
}
