package LogicalProgram;

import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner SC = new Scanner(System.in);
		
		int num = SC.nextInt();
		System.out.println("Enter the second Number");
		
		int num1 = SC.nextInt();
		System.out.println("Addition of two no is ="+(num+num1));
		System.out.println("Addition of two no is ="+(num-num1));
		

	}

}
