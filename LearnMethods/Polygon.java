

import java.util.ArrayList;
import java.util.List;

abstract public class Polygon {
	
	// Sides of the polygon in clockwise direction
	private List<Double> sides;
	
	public List<Double> getSides() {
	    return this.sides;
	}
	
	public Polygon(List<Double> sides)
	{
		this.sides=sides;
	}
	public Polygon(Double side1, Double side2){
	    if(this.sides != null){
	        this.sides.add(side1);
	        this.sides.add(side2);
	    }
	    else{
	        this.sides = new ArrayList<Double>();
	        this.sides.add(side1);
	        this.sides.add(side2);
	    }
	}
	
    abstract public double getArea();
}
