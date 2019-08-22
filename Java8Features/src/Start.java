
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b =  ()->{
		System.out.println("Lambda Expression");
		};
		b.m1();
		
		C c =( x,  y) ->{return x*y;};
		System.out.println(c.multiply(5, 10));
	}

}
