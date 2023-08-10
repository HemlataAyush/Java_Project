package ControlStatement;

public class NestedifStatements {

	public static void main(String[] args) {


		int age = 20;
		int Weight = 44;
		
		if(age >= 18) {
			if(Weight >= 50) {
				System.out.println("You are eligible for blood donation");
			}
		
		else if(Weight <= 50) {
			System.out.println("You are not eligible for blood donation");
		}
	    }
		else {
			System.out.println("age must be greater than 30");
		}
	}

}
