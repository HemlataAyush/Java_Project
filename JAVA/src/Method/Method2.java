package Method;

public class Method2 {

	public static void main(String[] args) {
	
		System.out.println("Main method started");
		
		//Directly calling
		//syntax Methodname();
		
		staticmethod1();
		staticmethod2();
		
		//Calling By Classname
		//syntax classname.methodname();
		
		Method2.staticmethod1();
		Method2.staticmethod2();

	}
	
	public static void staticmethod1() {
		
		int i = 10;
		int j = 20;
		int k = i+j;
		
		System.out.println("Addition of two number is : "+k);
	}
	
	public static void staticmethod2() {
		
		System.out.println("Static method calling from same class");
	}

}
