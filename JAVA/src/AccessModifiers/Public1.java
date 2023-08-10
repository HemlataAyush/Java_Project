package AccessModifiers;

public class Public1 {

	public int No = 100;

	public static void main(String[] args) {
		
		Public1 P1 = new Public1();
		P1.Demo1();
		P1.Demo2();
		
        System.out.println(P1.No);
	}
	
	public void Demo1() {
		
		System.out.println("Public Method");
	}
	
	public void Demo2() {
		
		System.out.println("Demo2 Public Method");
	}

}
