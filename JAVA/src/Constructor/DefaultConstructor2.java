package Constructor;

public class DefaultConstructor2 {
	
	// Default Constructor
	// public DefaultConstructor2() {
	//	super();
	// }
	
	//Rule
	
	//1. it is always no argument/ zero argument constructor
	//2. access modifier of the Default Constructor is same as the class modifier
	//3. Default Constructor conain only one line that is super() class/keywords
	// the defult constructor is used to provide the defult value to the object
	// ex - null,0,false
	
	

	public static void main(String[] args) {
		DefaultConstructor2 D1 = new DefaultConstructor2();
		D1.m1();
		D1.Addition();
		
		DefaultConstructor2 D2 = new DefaultConstructor2();
		D2.m1();
		D2.Addition();

	}
	
	public void m1() {
		System.out.println("Hello");
	}
	
	public void Addition() {
		
		int i = 10;
		int j = 20;
		int add = i+j;
		System.out.println(add);
	}

}
