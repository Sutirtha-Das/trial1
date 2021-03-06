/**
 * 
 */
package factory;

import java.util.concurrent.Callable;

/**
 * @author Sutirtha
 *
 */
public class PolygonFactory  implements Callable<Object>{
	
	private Polygon polygon;
	
	
	public Polygon getPolygon() {
		return polygon;
	}

	public void setPolygon(Polygon polygon) {
		this.polygon = polygon;
	}
	public PolygonFactory(int sides){

		if(sides == 3){
			this.polygon =  new Triangle();
		}
		else if(sides == 4){
			this.polygon =  new Square();
		}
		else if(sides == 5){
			this.polygon = new Pentagon();
		}else{
			this.polygon = null;
		}
	
	}
	public static Polygon getPolygon(int sides){
		if(sides == 3){
			return new Triangle();
		}
		else if(sides == 4){
			return new Square();
		}
		else if(sides == 5){
			return new Pentagon();
		}else{
			return null;
		}
	}

	@Override
	public Object call() throws Exception {
		System.out.println(getPolygon().getType());
		return getPolygon();
	}
}
