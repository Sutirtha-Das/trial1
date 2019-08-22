@FunctionalInterface
public interface B extends A {
	
	default void m2(){
		System.out.println("Default method");
	}
	
	static void m3(){
		System.out.println("Static method");
	}
}
