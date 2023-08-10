package Constructor;

public class RulesofConstructor {
	
//	1 we can not create constructor inside the method/ function
	
	//2 constructor name class name should be same
	public RulesofConstructor(){
		
		System.out.println("Hello");
	}
  // public RulesofConstructor(){
	
	//System.out.println("Hello");
  //	}
	
	//3. we can not declared any return type for the constructor like void
	//  if you declared void keyword in constructor that time compiler will treated as 
	//  a method
	
	//4. Applicable modifier/ specifier  - public, private, protected
	// 5. not applicable modifier/ specifier - static, native, final, abstract, synchronized

	public static void main(String[] args) {
	
		RulesofConstructor RC = new RulesofConstructor();
		//RC.RulesofConstructor();
	}

}
