package LogicalProgram;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
	 
		//Prime Number - PN is number that greater than 1 and divided by 1 or itself only.
		
		//EX- 2,3,5,7,11,13,15,17....
		
		System.out.println("Enter a number");
		
		Scanner Sc = new Scanner(System.in);
		
		int num = Sc.nextInt();
		int i;
		for(i=2; i<num; i++) 
			
			if(num%i==0)
			break;
		if(i==num)
			System.out.println("Prime Number");
		else
			System.out.println("Not prime number");
			

	}

}
