package String;

public class String2 {

	public static void main(String[] args) {
		// By using literal
		
	
		//By using new Keyword
		
		String S1 = new String("Java");  //Heap 
		String S2 = new String("Java");   //Heap
		
		
		String S3 = "Automation";  //SCP
		String S4 = "Automation";    //SCP
		String S5 = "automation"; 
		
		String S6 = new String("Test"); 
      
		System.out.println(S4 == S3);  //true
		
	
	}

}
