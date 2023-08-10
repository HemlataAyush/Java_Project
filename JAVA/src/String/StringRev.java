package String;

public class StringRev {

	public static void main(String[] args) {
		
		String str = "Welcome to java and automation";
		//Exp - emoclew ot avaj dna noitamotua;
		//Exp Result - automation and java to welcome
		
		String Rev = "";
		
		System.out.println(str.length());
		
		for(int i=str.length()-1; i>=0; i--) {
			Rev = Rev+str.charAt(i);
		}
		
		System.out.println(Rev);
		

	}

}
