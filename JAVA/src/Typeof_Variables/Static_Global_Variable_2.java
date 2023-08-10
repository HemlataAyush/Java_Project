package Typeof_Variables;

public class Static_Global_Variable_2 {
	
	static int Number = 200;
	static String name = "Rohini";

	public static void main(String[] args) {
		
		//Static globle variable call from same class
		//Creating variable outside the method/ function is know as globle variable
		
		System.out.println(Number);
		System.out.println(name);
		
		Static_Global_Variable_2.Demo1();
		Static_Global_Variable_2.Demo2();
		
		Static_Global_Variable_2 obj = new Static_Global_Variable_2();
		obj.Demo3();
		obj.Demo1();
		obj.Demo2();

	}
	
	public static void Demo1() {
		System.out.println(Number);  //200
		System.out.println(name);    //Rohini
		
		Number = 400;
		name ="ROhit";
		
	}
	
	public static void Demo2() {
		System.out.println(Number); //400
		System.out.println(name); //ROhit
		
	}
   
	public void Demo3() {
		System.out.println(Number); //400
		System.out.println(name);  //ROhit
	}
}
