/**
 * 
 */
package springapp01.springapp02.bean;

/**
 * @author Sutirtha
 *
 */
public class FourthBean {
	
	private String name;
	static{
		System.out.println("Loading FourthBean class into memory ");
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
	
	public FourthBean(){
		System.out.println("FourthBean is instantiated");
	}
}
