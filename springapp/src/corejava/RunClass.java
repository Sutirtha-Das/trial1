package corejava;

import java.util.HashMap;

public class RunClass {

	
	public static void main(String[] args){
		Student s = new Student();
		Class c = s.getClass();
		System.out.println(c.getName());
		String a = args[0];
		System.out.println(a);
		HashMap<String, String> myFirstMap = new HashMap<String, String>();
	}
}
