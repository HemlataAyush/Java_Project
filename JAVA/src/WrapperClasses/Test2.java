package WrapperClasses;

public class Test2 {

	public static void main(String[] args) {

  	   

		String S1= "200";
		String S2 = "400";
		
		System.out.println(S1+S2);
		
		int Value1 = Integer.parseInt(S1);
		int Value2 = Integer.parseInt(S2);
		int Addition = Value1+Value2;
		System.out.println(Addition);
		
		if(Addition==600) {
			System.out.println("Correct addition");
		}
		else {
			System.out.println("Incorrect addition");
		}


		
	}

}
