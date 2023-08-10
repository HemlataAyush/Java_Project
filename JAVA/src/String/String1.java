package String;

public class String1 {

	public static void main(String[] args) {
		// By using literal
		
		//syntax - string SRVN = "Values";
		
		String str = "Automation";  //SCP
		String str1 = "Automation";    //SCP
		
		//By using new Keyword
		
		String S1 = new String("Java");  //Heap 
		String S2 = new String("Java");   //Heap
		String S3 = new String("Automation");  //Heap
       
		System.out.println(str == str1);  //true
		System.out.println(str == S3);   //false
		System.out.println(S1 == S2);    //false//Heap
	}

}
