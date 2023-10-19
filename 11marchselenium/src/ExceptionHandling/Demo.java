package ExceptionHandling;

public class Demo {
	
	public static void m1 () {
		m2();
	}

	public static void m2() {
		m3();
		
	}

	public static void m3() {
		m4();
		
	}

	public static void m4() {
		int Number = 100;
		System.out.println(Number);
		
	}
	public static void main (String [] args) {
		m1();
	}

		
	

	
	
		
	

}
