package src.Arithmetic;



import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number of testCase");
        int name = scan.nextInt();   
        while(name > 0){
        	System.out.println("Enter the number");
        	int num = scan.nextInt();
        	ArmstrongNumber.isAmstrongNumber(num);
        	num--;
        }
      
	}

}
