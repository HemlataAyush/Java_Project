package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
	       
		HashSet HS = new HashSet();   //DC = 16 and LF - 0.75 and Hetro
		
		HashSet HS1 = new HashSet(200,(float)0.50); 
		
		HashSet<String> HS2 = new HashSet<String>();  //homo
		
		HS.add(22);
		HS.add("Test");
		HS.add(12.6);
		HS.add('D');
		HS.add(true);
		HS.add(null);
		HS.add(null);
		
		System.out.println(HS);
		
		System.out.println(HS.size());
		
		System.out.println(HS.add('H'));   //True
		System.out.println(HS.add('D'));   //false
		
		System.out.println(HS.size());
		//if u r trying to add dublicate element then it will return false
		//if the element is not present in haset that time it will return true
		
		//remove
		HS.remove('D');
		System.out.println(HS);
		
		//Set and Get are not present in hashset
		
		System.out.println(HS.isEmpty());
		System.out.println(HS1.isEmpty());
		
		//Contains
		
		System.out.println(HS.contains(22));  //true
		System.out.println(HS.contains(10));  //false
		
		System.out.println();
		System.out.println("Reading the element for using for loop");
		
	//	for(int i =0; i<HS.size(); i++) {
	//		System.out.println(HS.get());
	//	}
		
		System.out.println();
		System.out.println("Reading the element for using for each loop");
		
		for(Object obj : HS) {
			System.out.println(obj);
		}
        
		System.out.println();
		System.out.println("Reading the element for using iterator");
		
		Iterator IT = HS.iterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
		
	}

}
