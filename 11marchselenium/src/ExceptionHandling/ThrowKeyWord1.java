package ExceptionHandling;

public class ThrowKeyWord1 {
	
	public static void main (String [] args) {
		
		ThrowKeyWord1 thw = new ThrowKeyWord1();
		
		thw.sum();
		System.out.println("Hello");
	
	}

	public void sum() {
		try {
			div();
		}
		catch(ArithmeticException e) {
			
		}
		
	}

	public void div()  throws ArithmeticException ,NullPointerException,IndexOutOfBoundsException {
		int i = 10/0;
		int j = 100/0;
		
	}

}
