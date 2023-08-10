package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		int arr [] = new int[5];
		ArrayList AL = new ArrayList(); //dynamicrray = herotro and homo type
		ArrayList<String> AL1 = new ArrayList<String>();//static arraylist
		//AL1.add("WELCOME");
		//AL1.addadd(true);
		//AL1.add(200);
		
		
		AL.add("PYATHON"); //string
		AL.add(200); //int
		AL.add(30.3f); //float
		AL.add('A'); // char
		AL.add(30.4); // double
		AL.add(true); //bollean
		AL.add(null); //null
		
		System.out.println("number of element in given arrylist --"+AL);
		
		//2 size - Return the number of elements in this list
		System.out.println("Number of element in given arraylist "+AL.size());
		
		AL.add(300);
		AL.add(4000);
		AL.add("Test");
		System.out.println(("Number of element in given arraylist ")+AL.size());
		
		//3.Remove
		//syntax - RV.remove(element);
		
		System.out.println(AL);
		AL.remove(30.4);
		AL.remove("PYATHON");
		AL.remove(true);
		System.out.println(AL);
		
		//4.insert new element
		
		AL.add(20);
		System.out.println(AL);
		AL.add(3,"Python");
		System.out.println(AL);
		AL.add(4,'C');
		System.out.println(AL);
		
		//5.Retrieve specific element
		//get - Returns the element at the specific position in this list.
		System.out.println(AL.get(6));
		System.out.println(AL.get(8));
		System.out.println(AL.get(9));
		
		//6.Replace/change method
		//set-
		AL.set(1, "hema");
		System.out.println(AL);
		AL.set(5, 1000);
		System.out.println(AL);
		AL.set(0, "papa");
		System.out.println(AL);
		AL.set(9, "Automation");
		System.out.println(AL);
		
		//7.isempty
		System.out.println(AL.isEmpty());//false
		System.out.println(AL1.isEmpty());//true
		
		System.out.println();
		
		//8.
		//Read/Print the data from arraylist
		System.out.println("Reading element using for loop");
		 // 0<10 - true
		 // 1<10 - true
		 // 10<10 - true
	     for(int i = 0;i<AL.size(); i++) {
	    	 System.out.println(AL.get(i));
	     }
	     
	     System.out.println();
	     System.out.println("Reading element using for each loop");
	     //for each loop
	     for(Object obj : AL) {
	    	 System.out.println(obj);
	     }
	     System.out.println();
	     
	     Iterator I1 = AL.iterator();
	     while(I1.hasNext()) {
	    	 System.out.println(I1.next());
	     }
	     		
	}

}
