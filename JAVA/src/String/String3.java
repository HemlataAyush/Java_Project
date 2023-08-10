package String;

public class String3 {

	public static void main(String[] args) {
		// By using literal
		
	
		//By using new Keyword
		
		String S1 = new String("Java");  //Heap 
		String S2 = new String("Java");   //Heap
		
		System.out.println(S1==S2);  //false
		System.out.println(S1.equals(S2));  //true
		
		String S3 = "Automation";  //SCP
		String S4 = "Automation";    //SCP
		
		System.out.println(S3==S4);  //true
		System.out.println(S3.equals(S4));  //true


      //== Always compare reference comparison/ address comparison
	 // reference comparison means if both reference point into the same ob then it will giv true
		
	//.equals method
// contenr comparison means compare the two given string based on the content
//of the string. if any character is not matched it return false
    // if all character are match it return true		
		
		


		
	
	}

}
