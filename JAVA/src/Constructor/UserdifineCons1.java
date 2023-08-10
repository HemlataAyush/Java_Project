package Constructor;

public class UserdifineCons1{
	
	// without para con
	//1. var dec
	
	int Num1;
	int Num2;   //Non static global
	
	public UserdifineCons1() { // without para con
		// Var dec
		Num1 = 19;
		Num2 = 40;
		int add = Num1+Num2;
		
		//Use
		System.out.println(add);	
	}
	
	public UserdifineCons1(int a, int b) {
		
		Num1 = a;
		Num2 = b;
		int sum = Num1+Num2;
		System.out.println(sum);
	}
	
	public void Addition() {
		int sum = Num1+Num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
	  
		UserdifineCons1 UD = new UserdifineCons1();
	//	UserdifineCons1 UD1 = new UserdifineCons1(20,20);
		UD.Addition();
	//	UD1.Addition();
		

	}

}
