package Collection.List;

import java.util.Iterator;
import java.util.Vector;


public class Vector1 {

	public static void main(String[] args) {
		
		Vector VC = new Vector();   //hetro
		VC.add("Test");
		VC.add(2);
		VC.add(4);
		VC.add('F');
		VC.add(true);
		VC.add(44);
		 
		System.out.println(VC);
		
		System.out.println(VC.size());
		
		//remove
		
		VC.remove(4);
		System.out.println(VC);
		
		System.out.println(VC.remove("Test"));
		
		//Update
		VC.set(1, "Ayush");
		System.out.println(VC);
		
		VC.set(3, "Chaudhari");
		System.out.println(VC);
		
		System.out.println("Reading the element for using for loop");
		
		for(int i =0; i< VC.size(); i++) {
			System.out.println(VC.get(i));
		}
		
		System.out.println("Reading the element for using for each loop");
		
		for(Object obj : VC ) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Reading the element for using iterator");
		
		Iterator IT = VC. iterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
		
	
		

	}

}
