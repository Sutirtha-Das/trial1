package factory;

public class ColorFactory {
	
	public static Color getColor(String color){
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		}else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}else{
			return null;
		}
	}

}
