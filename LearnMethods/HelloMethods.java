import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class HelloMethods {
	int a;
	HelloMethods(int x){
		this.a = x;
	}
	HelloMethods(){
		this.a = 0;
	}
	public static void iterateMap(Map<String, String> Values)
	{

	for(Entry<String, String> entry:Values.entrySet())
	{
	System.out.print(entry.getValue()+", "+entry.getKey());
	}
	}
	public static void main(String[] args) {
		
		
		
		
		/*
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the string");
        String s = scan.next();
        printStringPyramid(s);
		*/
		/*
		Polygon r1 = new Rectangle(5,9);
		List<Double> sides = r1.getSides();
		double side1 = sides.get(0);
		double side2 = sides.get(1);
		double area1 = side1*side2;
		double area2=r1.getArea();
		System.out.println("Area1:" +area1);
		System.out.println("Area2:" +area2);
		
		Polygon s1 = new Square(3);
		double area3 = s1.getArea();
		double area4 = s1.getSides().get(0)*s1.getSides().get(1);
		System.out.println("area3:" +area3);
		System.out.println("area4:" +area4);
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		swap(i,j);
		Changes done in swap is not reflected in Main method.
		 *Java creates a copy of the variable being passed 
		 * the manipulates the copy of the variable.
		 * So all JAVA PRIMITIVES like int, char etc all always 
		 * PASS BY VALUE  
		System.out.println("I="+i+"J="+j);
		
		HelloMethods hm = new HelloMethods(30);
		 This is swap by reference.
		 * A non-primitive like object referenced is passed
		 * Java creates a copy of the parameter, and passes it to method
		 * However its still points to the same memory reference
		 * Value of the calling reference is modifed
		
		swap(hm);
		System.out.println("Main=>swapByReference=> HelloMethod.a="+hm.a);
		 This is swap by value for non-primitive types/references
		 * swapByValue instantiates a new Instance for HelloMethods
		 * Object reference hm, refers to the new memory allocated inside swapByValue
		 * However the calling reference from Main points to the same ol reference 
		swapByValue(hm);
		System.out.println("Main=>swapByValue=> HelloMethod.a="+hm.a);
		int x =1;
		int y = 4;
		int a= 5;
		int b = 9;
		String result = canReach(x, y, a, b);
		System.out.println("Result:"+ result);
		
		int[] arr = new int[]{18,90, 90, 13, 90, 75, 90, 8, 90, 43};
		int[] arr1 = new int[]{3, 2, 1, 3};
		frequencyOfmAxValues(arr1.length, arr1);
		
		convertTime("07:05:45PM");
		
		
	*/}
	//Overloading static method
	public static void swap(Integer i, Integer j){
		Integer temp = new Integer(5);
		i = j;
		j = temp;
		System.out.println("SWAP=> I="+i+"J="+j);
		
		
	}
	//Overloading static method
	public static void swap(HelloMethods hm){
		hm.a = 40;
		System.out.println("swapByReference=> HelloMethod.a="+hm.a);
	}
	
	public static void swapByValue(HelloMethods hm){
		hm = new HelloMethods();
		System.out.println("swapByValue=> HelloMethod.a="+hm.a);
	}
	
	public static String canReach(int x, int y, int a, int b){
		String result = "NO";
		if(x == a && y ==b){
			result = "YES";
			return result;
		}
		else if( x < a){
			result = canReach(x+y, y, a, b);
			return result;
		}
		else if(x == a && y < b){
			result = canReach(x, x+y, a, b);
			return result;
		}
		return result;
	}
	
	public static int frequencyOfmAxValues(int n, int[] arr){
		
		int maxValue = 0;
		int count = 0;
		
		for(int i = 0;i<n;i++){
			if(arr[i] > maxValue){
				maxValue = arr[i];
				count =1;
			}
			else if(arr[i] == maxValue){
				count += 1;
			}
		}
		
		return count;
		
	}
	
	public static void convertTime(String s){
		
		String[] timeArr = s.split(":");
		String amPm = timeArr[2].substring(2, 4);
		int hh = Integer.parseInt(timeArr[0]);
		int mm = Integer.parseInt(timeArr[1]);
		int ss = Integer.parseInt(timeArr[2].substring(0, 2));
		 if("AM".equalsIgnoreCase(amPm) && hh == 12){
			 hh = 0;
		 }
		 if("PM".equalsIgnoreCase(amPm) && hh < 12){
			 hh +=12;
		 }
		 
		 StringBuilder sb = new StringBuilder((new Integer(hh)).toString());
		 sb.append(":");
		 sb.append((new Integer(mm)).toString());
		 sb.append(":");
		 sb.append((new Integer(ss)).toString());
		 sb.toString();
		 System.out.println(sb.toString());
		 System.out.printf("%02d:%02d:%02d",hh,mm,ss);
	}
	
	public static void printStringPyramid(String s){
		int length = s.length();
		int position = 0;
		String currentStr = null;
		for(char c: s.toCharArray()){
			int space = length-position;
			while(space > 0){
				System.out.print(" ");
				space--;
			}
			
			if(position ==0 ){
				System.out.print(c);
				currentStr = Character.toString(c);
				
			}
			else{
				StringBuffer strBuf = new StringBuffer(currentStr);
				StringBuffer rev = strBuf.reverse();
				System.out.print(currentStr.concat(Character.toString(c)).concat(rev.toString()));
				currentStr = currentStr.concat(Character.toString(c));
			}
			/*for(int i = 0; i<position;i++){
				System.out.print(s.charAt(i));
			}
			
			for(int j=position-1;j>=0;j--){
				System.out.print(s.charAt(j));
			}*/
		position++;
		System.out.println("");
		}
	}
}
