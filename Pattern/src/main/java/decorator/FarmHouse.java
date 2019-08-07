/**
 * 
 */
package decorator;

/**
 * @author Sutirtha
 *
 */
public class FarmHouse extends Pizza {

	
	public FarmHouse(){
		description = "FarmHouse";
	}
	/* (non-Javadoc)
	 * @see decorator.Pizza#getCost()
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 150;
	}

}
