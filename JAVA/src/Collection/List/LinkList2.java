package Collection.List;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkList2 {

	public static void main(String[] args) {
		 
		LinkedList<String> LL = new LinkedList<String>();
		
		LL.add("Hema");
		LL.add("A");
		LL.add("B");
		LL.add("G");
		LL.add("E");
		LL.add("Z");
		
		System.out.println(LL);
		
		LinkedList<String>  LL1 = new LinkedList<String>();
		LL1.addAll(LL);
		System.out.println(LL1);
		
		//RemoveAll
		
		LL1.remove(LL);
		System.out.println(LL1);
		
		//Collections
		
		System.out.println("Before sort");
		Collections.sort(LL);
		System.out.println(LL);
		
		Collections.sort(LL,Collections.reverseOrder());
		System.out.println(LL);
		

	}

}
