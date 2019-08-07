/**
 * 
 */
package decorator;

/**
 * @author Sutirtha
 *
 */
public class Margherita extends Pizza {

	
	public Margherita(){
		description = "Margherita";
	}
	/* (non-Javadoc)
	 * @see decorator.Pizza#getCost()
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 75;
	}

}
