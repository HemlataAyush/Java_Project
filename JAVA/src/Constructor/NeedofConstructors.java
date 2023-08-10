package Constructor;

public class NeedofConstructors {
	
	public NeedofConstructors(){

		System.out.println("Defualt Constructor");
	}
	
	int RollNo = 10;
	String Name = "Nutan";

	public static void main(String[] args) {
		
		NeedofConstructors S1 = new NeedofConstructors();
		NeedofConstructors S2 = new NeedofConstructors();
		
		NeedofConstructors S199 = new NeedofConstructors();
		NeedofConstructors S200 = new NeedofConstructors();
		
		

	}
	
	public void m1() {
		System.out.println(Name+" "+RollNo);
	}
	public void m2() {
		System.out.println(Name+" "+RollNo);
	}

}
