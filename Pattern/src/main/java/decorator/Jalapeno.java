/**
 * 
 */
package decorator;

/**
 * @author Sutirtha
 *
 */
public class Jalapeno extends ToppingDecorator {

	Pizza pizza;
	
	public Jalapeno(Pizza pizza){
		this.pizza = pizza;
	}
	/* (non-Javadoc)
	 * @see decorator.ToppingDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.pizza.getDescription()+", Jalapeno";
	}

	/* (non-Javadoc)
	 * @see decorator.Pizza#getCost()
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.pizza.getCost()+70;
	}

}
