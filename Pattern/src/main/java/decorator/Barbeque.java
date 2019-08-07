/**
 * 
 */
package decorator;

/**
 * @author Sutirtha
 *
 */
public  class Barbeque extends ToppingDecorator {

	Pizza pizza;
	
	
	public Barbeque(Pizza pizza){
		this.pizza = pizza;
	}
	/* (non-Javadoc)
	 * @see decorator.ToppingDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.pizza.getDescription()+ ", "+ "Barbeque";
	}

	/* (non-Javadoc)
	 * @see decorator.Pizza#getCost()
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.pizza.getCost() + 90;
	}

}
