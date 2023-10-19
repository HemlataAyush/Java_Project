package ExceptionHandling;

import java.util.ArrayList;

public class OutOfMemoryError {
	
	public static void main (String [] args) {
		
		String Str = "Rahul";
		
		ArrayList AL = new ArrayList();
		
		while (true) {
			Str = Str +"Test";
			
			AL.add(Str);
			
			System.out.println(AL);
		}
	}

}
