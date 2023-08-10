package Typeof_Variables;

public class Non_Static_Global_Variable_2 {
	
	String name = "Rohit";
	

	public static void main(String[] args) {
		
		System.out.println(DifferentClass1.age);
		System.out.println(DifferentClass1.name);
		
		
		
		DifferentClass1 D1 = new DifferentClass1();
		System.out.println(D1.Name1);
		System.out.println(D1.RollNumber);
		
		
		
		//Non_Static_Global_Variable CALL frome same class
		Non_Static_Global_Variable_2 V1 = new Non_Static_Global_Variable_2();
	    System.out.println(V1.name);
	    V1.Demo();

	}
	
	public void Demo() {
		
		int RR = 55;
		System.out.println(RR);
		System.out.println(name);
	}

}
