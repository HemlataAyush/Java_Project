package Method;

public class Method6 {
	
	//Non static regular method Calling same class

	public static void main(String[] args) {
		
		//Direct calling
		m3();
		//object creating
		//syntac classname referencevariablename = new classname();
		//refvarname.methodname
		
		Method6 OBJ = new Method6();
		
		//We need to create first object of class
		//After creating the object copy all the non static method will be store in the
		//object
		OBJ.m1();
		OBJ.m2();
		OBJ.m3();
		
		System.out.println("main method ended");
		
		//Question
		//Can i access static method by using object reference? -- Yest/No
		//Ans --> Yes we can access static method but it will throw warning message
		//Message --> The static method m3() from the type method6 should be access in a static way
	   

	}
	
	public void m1() {
		System.out.println("non static regular method calling frome same class -- m1");
	}
	
	public void m2() {
		System.out.println("non static regular method calling from same class -- m2");
	}
	
	public static void m3() {
		System.out.println("static method");
	}

}
