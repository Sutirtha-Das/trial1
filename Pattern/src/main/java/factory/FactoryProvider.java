/**
 * 
 */
package factory;

/**
 * @author Sutirtha
 * @param <T>
 * @param <S>
 *
 */
public class FactoryProvider<T, S> extends AbstractFactory<T, S>{
	Object obj = new Object();
	@Override
	public AbstractFactory<T, S> createFactory(int sides, String color) {
		AbstractFactory.T = PolygonFactory.getPolygon(sides);
		AbstractFactory.S = ColorFactory.getColor(color);
		return new FactoryProvider<T , S>();
		
	}

}
