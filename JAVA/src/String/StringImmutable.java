package String;


public class StringImmutable{

	public static void main(String[] args) {
		
   //Once we create an object after that the java does not allow to perfom changes
   // but if u are trying to perfom any changes with those changes new object will created
		
		String str = "Rahul";   //19
		String str1 = "Python";  //28
		String str2 = "Java"; //19
		String str3 = "Amol";  //19
		
		str = "Ruby"; //28
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str);
		System.out.println(str);
		System.out.println(str2);
		
		//1. security
		//2. code optiimization and performance
		
		
	
	}

}
