package ControlStatement;

public class ifelseifladderStatement {

	public static void main(String[] args) {
		
	//	if(condition 1) {
	//	  Statements 1 //Executed when codition is true
	//	}
	//	else if(condition 2) {
	//	  Statements 2 // Executed when condition is true
	//	}
	//	else if(Condition 3) {
	//		Statements 3 // Executed when condition is true
	//	}
	//	else if(condition 4) {
    //         Statements 4 // Executed when condition is true    
	//	}
	//	else {
	//		Statements 5 //Executed when condition is false
	//	}
		
		
		int marks = 25;
		if(marks >=65) {
			System.out.println(" Distinction");
		}
		else if(marks > 60) {
			System.out.println("First class");
		}
		else if(marks > 55) {
			System.out.println("Higher Seconder class");
		}
		else if(marks > 50) {
			System.out.println("Second class");
		}
		else if(marks > 35) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
		}
	}

}
