/**
 * 
 */
package decorator;

/**
 * @author Sutirtha
 *
 */
public abstract class Pizza {
	String description = "Unknown Pizza";
	
	public String getDescription(){
		return this.description;
	}
	
	public abstract int getCost();
}
