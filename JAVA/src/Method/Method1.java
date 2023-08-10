package Method;

public class Method1 {

	public static void main(String[] args) {

		// Starting point the peogram
		System.out.println("Main method started");
		
		//1. Directly calling
		
		//syntax --Methodname();
		Demo1();
		Demo2();
		
		//2. calling by class name
		//syntax - classname.methodname();
		
		Method1.Demo1();
		Method1.Demo2();

	}
     
	public static void Demo1() {
		
		System.out.println("Static regular method calling from Demo1");
	}
	
	public static void Demo2() {
		
		System.out.println("Static regular method calling from class --> Demo2");
	}
}


	


