package Constructor;

public class Rule5 {
	
	//any number of constrctor can be declared in java but constructor name should be 
	// same as class name but argument/ parameter should be different
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Rule5() {
		System.out.println("Zero input argument constructor");
		
	}
	public Rule5(int i) {
		System.out.println("One input argument constructor");
	}
	public Rule5(int i, int j, int k) {
		System.out.println("three input argument constructor");
	}
	public Rule5(int i, int j) {
		System.out.println("two input argument constructor");
	}

}
