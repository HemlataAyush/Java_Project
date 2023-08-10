package Collection_Set;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet HS2 = new HashSet();
		
		HS2.add(2);
		HS2.add(22);
		HS2.add(23);
		HS2.add(24);
		HS2.add(25);
		HS2.add(25);
		HS2.add(15);
		System.out.println(HS2);
		
		System.out.println(HS2.size());
		
		HashSet HS3 = new HashSet();
		
		HS3.add(22);
		HS3.add(34);
		HS3.add(35);
		HS3.add(36);
		HS3.add(29);
		HS3.add(2);
		
		System.out.println(HS3);
		
		//AddAll
		HS2.addAll(HS3);       // Only display unique element
		System.out.println(HS2);
		
		//Retainall
		
		HS2.retainAll(HS3);   //Only common element will display
	//	System.out.println(HS2);
		
	//	System.out.println(HS2.contains(HS3));
		
		HS2.removeAll(HS3);
		System.out.println(HS2);
	}

}
