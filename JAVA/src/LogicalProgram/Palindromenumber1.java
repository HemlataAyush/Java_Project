package LogicalProgram;

import java.util.Scanner;

public class Palindromenumber1 {

	public static void main(String[] args) {
		
		int OriginalNumber, sum, Rem;
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		OriginalNumber = num;
		
		//121>0 - true
		//121/ 10 = 1
		//1>0 = true
		// 1/10 = 0
		
		
		for(sum = 0; num >0; num = num/10) {
			
			Rem = num % 10;      //121%10= 1  12%10 = 2  1%10 = 1
			
			sum = sum*10+Rem;    // 0= 0*10+1 = 1
			                     // 1= 1*10+2 = 12 
			                     // 12 = 12*10+1 = 121
		}
		//(121 == 121)
		if(OriginalNumber==sum) {
			
			System.out.println("Palindronumber1");
		}
		else {
			
			System.out.println("Non Palindronumber1");
		}
		

	}

}
