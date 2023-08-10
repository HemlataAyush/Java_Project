package Constructor;

public class DefaultConstructor1 {
	
	String Name ;
	int RollNo ;
	
	public DefaultConstructor1() {
		System.out.println("Default Constructor1");
	}

	public static void main(String[] args) {
		DefaultConstructor1 D1 = new DefaultConstructor1();
		DefaultConstructor1 D2 = new DefaultConstructor1();
		DefaultConstructor1 D3 = new DefaultConstructor1();

	}
	
	public void Method1() {
		System.out.println("Default Method");
	}

}
