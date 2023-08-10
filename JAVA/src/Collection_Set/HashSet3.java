package Collection_Set;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		
	       HashSet<String> HS1 = new HashSet<String>();
	       
	       HashSet<String> HS3 = new HashSet<String>();
	       
	       HS1.add("Hema");
	       HS1.add("Patel");
	       HS1.add("Soni");
	       HS1.add("Neeva");
	       HS1.add("Java");
	       HS1.add("Automation");
	       HS1.add("Python");
	       
	       System.out.println(HS1);
	       
	       System.out.println(HS1.size());
	       
	       HS3.addAll(HS1);
	       System.out.println(HS3);
	       
	       HS3.removeAll(HS1);
	       System.out.println(HS3);
	       
	     

	}

}
