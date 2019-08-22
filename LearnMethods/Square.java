



public class Square extends Rectangle{
	
	private double side;
	
	public Square(double side) {
	    /* Constructor for class Square
	    
	    Implement the logic to initialize the side attribute of this object
	    and the listOfSides attibute inherited from the Parent object.
	    
	    */
	    super(side);
	    this.side = side;
	    
	}
	    
	    
	public double getArea()
	{
		/* Method which returns the area for this Square object.
		
		Implement the logic to calculate the area of the object and return it.
		
		*/
		return this.side*this.side;
	}
}
