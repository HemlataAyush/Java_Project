package LogicalProgram;

public class SwappingTwoNwithoutThirdvar {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		 System.out.println("Before Swapping values :"+a+" "+b);
          
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 
		 System.out.println("Before Swpping Values ;"+a+" "+b);
	}

}
