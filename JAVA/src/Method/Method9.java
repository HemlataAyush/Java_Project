package Method;

public class Method9 {

	public static void main(String[] args) {
		
		//1. Method without parameter / zero Parameter
		Method9 M = new Method9();
		M.Addition();
		M.Addition1();
		
		//calling by classname
	    Method9.Addition1();
	    
	    //direct calling Methodname
	    Addition1();

	}
	
	public void Addition() {
		 int a = 10;
		 int b = 20;
		 int c = a+b;
		 
		 System.out.println("Addition of two number is :"+ c);
	}
	
	public static void Addition1() {
		int a = 10;
		int b= 30;
		int c = a+b;
		System.out.println("Addition of two number is :"+ c);
		
	}

}
