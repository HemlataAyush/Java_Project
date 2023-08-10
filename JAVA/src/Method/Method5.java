package Method;

public class Method5 {

	//Non static regular method calling from same class
	
	public static void main(String[] args) {
		
		System.out.println("main method Starting");
		
		//Direct calling
		//Demo1();
		//Demo2();
		
		//2. Classing clas name
		//Method5.Demo1();
		//Method5.Demo2();
		 
		
		//object Creation
		//syntax - classname Referencevariablename = new classname();
		
		Method5 obj = new Method5();
		
		//objrefVarname.methodname();
		obj.Demo1();
		obj.Demo2();
		obj.m1();
		
	}
	
	public void Demo1() {
		System.out.println("Non static regular method calling from same class -- Demo1");
	}
	
	public void Demo2() {
		
		System.out.println("Non static regular method calling from same class -- Demo2");
	}
	
	public void m1() {
		System.out.println("Hello");
	}
}
