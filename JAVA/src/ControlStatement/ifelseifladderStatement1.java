package ControlStatement;

public class ifelseifladderStatement1 {

	public static void main(String[] args) {
		int day = 8;
				
				
	   if(day ==1) { // 4 == 1 --false
		   System.out.println("sunday");
	   }
	   else if(day ==2) { // 4 == 2 --false
		   System.out.println("Monday");
	   }
	   else if(day == 3) { // 4 == 3 --false
		   System.out.println("Tuesday");
	   }
	   else if(day == 4) { // 4 == 4 --True
		   System.out.println("Wednesday");
	   }
	   else if(day == 5) {
		   System.out.println("Thusday");
	   }
	   else if(day == 6) {
		   System.out.println("Friday");
	   }
	   else if(day == 7) {
		   System.out.println("Saturday");
	   }
	   else {
		   System.out.println("Invalid day");
	   }

	}

}
