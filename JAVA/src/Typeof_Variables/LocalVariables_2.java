package Typeof_Variables;

public class LocalVariables_2 {

	public static void main(String[] args) {
	   
		int Number = 10;
		System.out.println(Number);
		
		LocalVariables_2.Test1();
		LocalVariables_2.Test2();

	}
	public static void Test1() {
		
		int Number1 = 200;
		System.out.println(Number1);
	}
	
	public static void Test2() {
		
		int i = 100;
		int j = 20;
		int k = i+j;
		System.out.println(k);
		
	}
     
}
