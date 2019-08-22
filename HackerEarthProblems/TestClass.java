import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;


public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number of testCase");
        int name = scan.nextInt();   
        TestClass tc = new TestClass();
        //tc.sieveOfEratosthenes(name);
        while(name-- != 0){
			System.out.println("Enter you seat number");
			int s=scan.nextInt(); 
			//tc.printOppositeSeat(s);
			tc.printOppositeSeat(s, name);
        }
      
	}
	//Sieve of Eratosthenes to print all prime numbers
	public void sieveOfEratosthenes(int n){
		boolean prime[] = new boolean[n+1];
		for(int i= 0;i<n;i++){
			prime[i] = Boolean.TRUE;
		}
		
		for(int p=2;p*p <=n; p++){
			
			if(prime[p] == true){
				for(int i=p*2;i<=n;i+=p){
					prime[i]=false;
				}
			}
		}
		
		for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
	}
	
	//Seating Arrangement: Find Opposite seat Number and seatType - WS/MS/AS
	
	public void printOppositeSeat(int s){
		
			int rem=s%12;
			switch(rem){
			case 0:
			      System.out.println((s-11)+" WS");
				  break;
			case 1:
			      System.out.println((s+11)+" WS");
				  break;
			case 2:
			      System.out.println((s+9)+" MS");
				  break;
			case 3:
			      System.out.println((s+7)+" AS");
				  break;
			case 4:
			      System.out.println((s+5)+" AS");
				  break;
			case 5:
			      System.out.println((s+3)+" MS");
				  break;
			case 6:
			      System.out.println((s+1)+" WS");
				  break;
			case 7:
			      System.out.println((s-1)+" WS");
				  break;
			case 8:
			      System.out.println((s-3)+" MS");
				  break;
			case 9:
			      System.out.println((s-5)+" AS");
				  break;
			case 10:
			      System.out.println((s-7)+" AS");
				  break;
			case 11:
			      System.out.println((s-9)+" MS");
				  break;
			}
	}
	
  	public void printOppositeSeat(int num, int testCase) {
  		 
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		for(int i=1;i<=108;i+=12){
			
			int start=i+11;
			int cond=1,con=0;
			for(int j=i;j<i+6;j++){
				String s="";
				if(cond==1 || cond==6){
					s+="WS";
				}else if(cond==2 || cond==5){
					s+="MS";
				}else{
					s+="AS";
				}
				cond++;
				
				
				
				hm.put(j, start+" "+s);
				hm.put(start, j+" "+s);
				start--;
			}
		}
		System.out.println(hm.get(num));
		
	
}

}
