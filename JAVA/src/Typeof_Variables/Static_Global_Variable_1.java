package Typeof_Variables;

public class Static_Global_Variable_1 {
	
	static int Number = 10;

	public static void main(String[] args) {
		
		Static_Global_Variable_1 obj = new Static_Global_Variable_1();
		obj.M1();
		obj.M2();
		obj.name();
		obj.name1();

	}
	
	public void M1() {
		System.out.println(Number);    //10
		
		Number = 400;
		System.out.println(Number);   //400
	}
	
	public void M2() {
		
		System.out.println(Number);   //400
		
		Number = 500;
		System.out.println(Number);  //500
	}
	
	public void name() {
		System.out.println(Number);  //500
	}
    
	public void name1() {
		System.out.println(Number);  //500
	}
}
