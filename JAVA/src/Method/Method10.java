package Method;

public class Method10 {

	public static void main(String[] args) {
		
		Method10.addition(10, 30);
		Method10.Substraction(90, 50);
		Method10.Addition1(50, 40, 30);

	}
	
	public static void addition(int a, int b) {
		
	    int c = a+b;
	    System.out.println("Addition of two no. "+c);
	}
	
	public static void Substraction(int a, int b) {
		
		int c = a-b;
		System.out.println("Substraction of two no. "+c);
	}
	
	public static void Addition1(int a, int b, int c) {
		int sum = a+b-c;
		System.out.println("Addition of three number :"+sum);
	}

}
