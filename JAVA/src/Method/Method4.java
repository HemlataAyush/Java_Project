package Method;

public class Method4 {

	public static void main(String[] args) {

     // Static regular method Calling by different class
		
		//calling by sameclass
		
		Demo4();
		
	 // Syntax classname.methodname();
		
		Method3.Test1();
		Method3.Test2();
		Method4.Demo4();

	}
      
	public static void Demo4() {
		
		System.out.println("Demo 4 Method");
	}
}
