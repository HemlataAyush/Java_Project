 package ExceptionHandling;

public class Stackoverflowerror {
	
	static int no = 1;
	
	public static void printnumber() {
		if (no<=100000) {
			System.out.println("Good morning");
			
			no++;
			printnumber();
			
		}
	}
	public static void main(String [] args) {
		printnumber();
	}

}
