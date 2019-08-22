/**
 * 
 */
package decorator;

/**
 * @author Sutirtha
 *
 */
public class PeppyPanneer extends Pizza {

	public PeppyPanneer(){
		description = "PeppyPanneer";
	}
	
	/* (non-Javadoc)
	 * @see decorator.Pizza#getCost()
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 100;
	}

}
