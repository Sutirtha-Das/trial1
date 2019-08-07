package src.Arithmetic;

public class ArmstrongNumber {
	
	public static void isAmstrongNumber(int number){
		
		int temp = number;
		int sum = 0;
		while(temp > 0){
			int x = temp%10;
			sum = sum + (x*x*x);
			temp = temp/10;
		}
		if(sum == number){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
