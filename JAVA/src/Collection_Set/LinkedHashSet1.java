package Collection_Set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet LHS = new LinkedHashSet();
		LinkedHashSet<Integer> LHS1 = new LinkedHashSet();
		
		//same method are present which is present in hashset class
		//Defult capacity & LF = 16 & 0.75
		//Duplicate element are not allowed
		//insertion order is preserved
		
		
		LHS.add(200);
		LHS.add(205);
		LHS.add('4');
		LHS.add("Welcome");
		LHS.add(null);
		LHS.add(null);
		System.out.println(LHS);
		System.out.println(LHS.add(200));  //False
		System.out.println(LHS.add(400));  //true
		System.out.println(LHS);
		
		

	}

}
