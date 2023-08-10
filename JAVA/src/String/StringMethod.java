package String;




public class StringMethod{

	public static void main(String[] args) {
	 
		//CharAt method/function - it return char values for the particular/specified index
		
		String str = "Velocity";
		
		System.out.println("Index-----"+str.charAt(5));
		System.out.println("Index-----"+str.charAt(2));
	//	System.out.println(str.charAt(10));     //java.lang.StringIndexOutOfBoundsException
		
	//	System.out.println(str.charAt(-1));     //java.lang.StringIndexOutOfBoundsException
		
	//	2.length(); - it retrun length/size
		
		System.out.println(str.length());
		
    //  3. .equals - it check the equality of the string with given object
		
		String S2 = "Velocity";
		String S3 = "Velocity";
		String S4 = new String("Velocity");
		
		System.out.println(S2.equals(S3));   //true
		System.out.println(S2.equals(S4));   //true
		
   // 4. isEmpty - to check weather the string is empty or not
		
		String S5 = "Automation";
		System.out.println(S5.isEmpty());  //false
		String S6 = "";
		System.out.println(S6.isEmpty());  //true
		
  // 5. Replace
		String S7 = "Automation";
		System.out.println(S7.replace("A", "Z"));
		System.out.println(S7.replace("t", "O"));
		System.out.println(S7.replace("m", "&"));
		
		String S8 = "22 08 2022";
		System.out.println(S8.replace(" ", "/"));
		
  // 6. Replace All
		String S9 = "Python java CPP Classes";
		System.out.println(S9.replaceAll("Python java", "Automation"));
		System.out.println(S9.replaceAll(" ", ""));
		
//  7. Substring - it returns substring for given string
	// Starting index is included and ending index excluded
		
		String S10 = "Velocity classes";
		System.out.println(S10.substring(4,8));
		System.out.println(S10.substring(0,4));
		System.out.println(S10.substring(2));
		
	//8. index of cha
		String S11 = "Python Ruby Python";
		System.out.println("INDEX---"+S11.indexOf('t'));   //1 occurance
		System.out.println("Index :---"+S11.indexOf('t')+1);  //2 occureance
		System.out.println("Index :---"+S11.indexOf('t', S11.indexOf('t')+1)+1);  //3 occurance
		
	//9. LastIndexOf
		
		String S12 = "Python";
		System.out.println(S12.lastIndexOf('n'));
		
	//10. ToLowerCase
		
		String S13 = "WELCOME";
		System.out.println(S13.toLowerCase());
		
    //11.ToUpperCase
		
		String S14 = "welcome";
		System.out.println(S14.toUpperCase());
		
	//12. Trim  - it remove bag and ending spaces of the string
		
		String S15 = "Python Ruby Python";
		
		System.out.println(S15);
		System.out.println(S15.trim());
		
	//13. Split
		
		String S16 = "Hello/World/Test/Java";
		String S17[] = S16.split("/");
		for(int i=0; i<S17.length;i++) {
			System.out.println(S17[i]);
		}
		
        String Date = "3-4-2030";
        String Date1[] = Date.split("-");
        for(int i=0;i<Date1.length;i++) {
        	System.out.println(Date1[i]);
        }
        
    //14. Concat - it cone the specific string
        
        String x = "Hello";
        String y = "World";
        
        int a= 10;
        int b= 20;
        
        System.out.println(x+y);  //HelloWorld
        System.out.println(a+b);   //30
        System.out.println(x+y+a+b);   //HelloWorld1020
        System.out.println(a+b+x+y);   //30HelloWorld
        System.out.println(x+y+(a+b));  //HelloWorld30
        
        //ChartAt,length(),Split,.equal,Concel
				
				
		
		
		
		
		
	}

}
