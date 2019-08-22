package factory;

public abstract class AbstractFactory<T,S> {
	public static  Polygon T;
	public static Color S;
	
	public abstract AbstractFactory<T, S> createFactory(int sides, String color);
}
