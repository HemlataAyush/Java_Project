package FinalFinallyFinalize;

public class Final {

	public static void main(String[] args) {

   //Variable
   //Final is the keyword and access modifier which is usse to restriction on variable, class, method
   //1. Final class can not inherited to child class
   //2. Final method means we can not overridden by sub class
   //3. Once we declared as a final variable we can not be modified
		
		int Number = 10;
		Number = 200;
		System.out.println(Number);
		
		final int Number1 = 10;
		System.out.println(Number1);
		
		//Number1 = 800;

	}
	
	public final void Test() {
		System.out.println("hello");
		
	}

}
