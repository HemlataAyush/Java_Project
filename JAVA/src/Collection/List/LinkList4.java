package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkList4 {
   
	public static void main(String[] args) {
		
	LinkedList LK = new LinkedList();
	LinkedList LK1 = new LinkedList();
	LK.add("HUI");
	LK.add(2);
	LK.add(2.0);
	LK.add('J');
	LK.add(true);
	LK.add(null);
	LK.add(null);
	LK.add(true);
	System.out.println(LK);
	System.out.println(LK.size());
	LK.add(2, 78);
	System.out.println(LK);
	LK.remove(2.0);
	System.out.println(LK);
	System.out.println(LK.remove(7));
	System.out.println(LK.get(4));
	LK.set(2, 200.9);
	System.out.println(LK);
	System.out.println(LK.isEmpty());
	
	System.out.println(LK.contains(null));
	System.out.println(LK.getFirst());
	System.out.println(LK.add(LK));
	
	System.out.println();
	
	for(int i = 0; i<LK.size();i++) {
		System.out.println(LK.get(i));
	}
	System.out.println();
	for(Object obj : LK ) {
		System.out.println(obj);
	}
	System.out.println();
	
	Iterator IT =  LK. iterator();
	while(IT.hasNext()) {
		System.out.println(IT.next());
	}
	System.out.println();
	
	LK1.addAll(LK);
	System.out.println(LK1);
	
	LK1.removeAll(LK);
	System.out.println(LK1);
	
	
	
	
	}
	}
