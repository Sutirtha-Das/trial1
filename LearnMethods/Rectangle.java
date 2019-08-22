

import java.util.Arrays;
import java.util.List;

public class Rectangle extends Polygon {
    
    private double side1, side2;
	
    public Rectangle(double side) {
	    /* Constructor for class Rectangle
	    
	    Implement the logic to initialize the side attribute of this object
	    and the listOfSides attibute inherited from the Parent object.
	    
	    */
	    super(side,side);
	    this.side1 = side;
	    this.side2 = side;
	}
    
	public Rectangle(double side1, double side2) {
	    /* Constructor for class Rectangle
	    
	    Implement the logic to initialize the side attribute of this object
	    and the listOfSides attibute inherited from the Parent object.
	    
	    */
	    super(side1, side2);
	    this.side1 = side1;
	    this.side2 = side2;
	}
	
	public double getArea()
	{
        /* Method which returns the area for this Rectangle object.
		
		Implement the logic to calculate the area of the object and return it.
		
		*/
		return this.side1 * this.side2;
	}
}
