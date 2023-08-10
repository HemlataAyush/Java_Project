package LoopStatements;

public class WhileLoop2 {

	public static void main(String[] args) {
		// WAP  Print 10 to 20 number using while loop
		
		int i = 10;
		
		//11<=20 - true
		//12<=20 - true
		//13<=20 - true
		//21<=20 - false
		while(i<=20) {
			System.out.println(i);
			i++; //11 14 17 20
			i++;     //12 15 18
			i++;     //13 16 19
		}
		
         System.out.println("Loop completed");
	}

}
