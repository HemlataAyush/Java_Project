package Method;

public class Method8 {

	public static void main(String[] args) {
		
	//  Method7.m4();
	//	Method7.m5();
		
		Method7 obj = new Method7();
		obj.m4();
		obj.m5();
		
		Method8 obj1 = new Method8();
		obj1.m6();

	}
	
	public void m6() {
		
		System.out.println("Non static method calling from same class --m6");
	}

}
