package LogicalProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int P,Sum, Rem;
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
	     int Num = sc.nextInt();
	     
	     P = Num; //153
	     
	     for(Sum = 0; Num>0; Num = Num / 10) {
	    	
	    	 Rem = Num % 10;       //153% 10= 3  15%10=5   1%10= 1
	    	                       //
	    	 
	    	 Sum = Sum + Rem * Rem *Rem;	//0 = 0+3*3*3 = 27
	    	                                //27= 27+5*5*5= 152
	    	                                //152= 152+1*1*1= 153
	     }
	     
	     if(Sum == P) {
	    	 
	    	 System.out.println("Armstrong Number");
	     }
	     else
	     {
	    	 System.out.println("Non Armstrong Number");
	     }
	     
		}

	}


