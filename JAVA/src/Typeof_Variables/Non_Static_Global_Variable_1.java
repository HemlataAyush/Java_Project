package Typeof_Variables;

public class Non_Static_Global_Variable_1 {
	
	   int Age1 = 50;  //Non static global var
	   String name = "Ketan";
	   

	public static void main(String[] args) {
		
		Non_Static_Global_Variable_1 NSG = new Non_Static_Global_Variable_1();
		
		//Syntax
		
		System.out.println(NSG.Age1);
		System.out.println(NSG.name);
		NSG.Test();
		

	}
	
	public void Test() {
		
		int Demo = 40;
		
		name = "RRR";
		
		System.out.println(Demo);
		System.out.println(name);
		
	}

}
