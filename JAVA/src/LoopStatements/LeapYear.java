package LoopStatements;

public class LeapYear {

	public static void main(String[] args) {

           //Condition for leap year
		//year should be divisible by 400 and 4 but not by 100
		
		int Year = 2000;
		
	//	if(((Year%400==0) && (Year%4==0)) || (Year %100==0)){
			
	//		System.out.println("Specified year is a leap year");
	//	}
	//	else {
	//		System.out.println("Specified year is not a leap year");
	//	}
	
		if(Year%400 ==0) {
			System.out.println("This year is a leap year"+Year);
		}
		
		else if(Year%4 == 0) {
			System.out.println("This Yaer is not a leap year"+ Year);
		}
		else if(Year%100 ==0) {
			System.out.println("This year is a leap year"+Year);
		}
		else {
			System.out.println("This year is not a leap year");
		}
		
		
		//(2000%400==0 && 2000%100 !=0  --false)  2000%400==0 --true
		
	}

}
