package Typeof_Variables;

public class LocalVariables_1 {

	public static void main(String[] args) {
		
		LocalVariables_1.m1();
		LocalVariables_1.m2();

	}
	public static void m1() {
		 int RollNo = 20;
		 String Name = "Hetu";
		 
		 //int static Name1 = 30; -> WE cannot declared static variable inside the main method
		 //body or any kind of method of the class
		 
		 System.out.println(RollNo);
		 System.out.println(Name);
		 }
	public static void m2() {
		
		int ABC = 30;
		System.out.println(ABC);
	}

}
