package springapp01.springapp02.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SeventBean {
	
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
	
	@PostConstruct
	public void initializeBean(){
		System.out.println("Initializing Bean through @PostConstruct");
		name="Supragyan";
		
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Destroying the bean using @PreDestroy");
	}
}
