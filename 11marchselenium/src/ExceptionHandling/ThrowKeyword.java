package ExceptionHandling;

public class ThrowKeyword {
	
	public static void main(String [] args) {
		
		System.out.println("Hello");
		
		try {
			throw new Exception("Automation testing");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hii");
	}

}
