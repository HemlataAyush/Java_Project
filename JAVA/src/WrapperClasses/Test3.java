package WrapperClasses;

public class Test3 {

	public static void main(String[] args) {

  	   

		String S1= "200.09";
		String S2 = "400.90";
		
		System.out.println(S1+S2);
		
		double Value1 = Double.parseDouble(S1);
		double Value2 = Double.parseDouble(S2);
		double Addition = Value1+Value2;
		System.out.println(Addition);
		
		if(Addition==600) {
			System.out.println("Correct addition");
		}
		else {
			System.out.println("Incorrect addition");
		}


		
	}

}
