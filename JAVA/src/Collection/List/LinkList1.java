package Collection.List;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList1 {

	public static void main(String[] args) {

		     LinkedList LL = new LinkedList();
             
             LinkedList<String> LL1 = new LinkedList<String>();
             
            // LL1.add("Hema");
            // LL1.add("Automation");
             //LL1.add("Java");
             System.out.println(LL1);
             
             LL.add("ABCD");
             LL.add("Welcome");
             LL.add(123);
             LL.add(20.5);
             LL.add(null);
             LL.add(true);
             LL.add(null);
             LL.add(20);
             
             System.out.println(LL);
             
             // 1. Size
             System.out.println(LL.size());
             
             // 2. remove
             System.out.println(LL.remove("Welcome"));
             System.out.println(LL.remove("JAVA"));
             System.out.println(LL);
             System.out.println();
             
             //3. Inserting
             
             LL.add("PRIYANKA");
             LL.add(3, "Nutan");
             System.out.println(LL);
             
             //4.  Retrive Method
             //Get- Return the element at the specific position
             
             System.out.println(LL.get(5));
             System.out.println(LL.get(3));
             
             //FirstElement
             
             System.out.println(LL.getFirst());
             
             //Lastelement
             
             System.out.println(LL.getLast());
             
             //isEmpty
             
             System.out.println(LL.isEmpty());
             System.out.println(LL1.isEmpty());
             
             //contains
             //Return true if this list contains the specified element. more formally.
             
             System.out.println(LL.contains(123));
             System.out.println(LL.contains("PRIYANKA"));
             
             System.out.println();
             
             //Reading element using for loop
             
             for(int i = 0; i<LL.size() ; i++) {
            	 System.out.println(LL.get(i));
             }
               
             System.out.println("Reading element using for each loop");
             // Reading element using for rach loop
             
             for(Object obj : LL) {
            	 System.out.println(obj);
             }
             
             System.out.println("Reading element using for iterator");
             
             Iterator IT = LL. iterator();
             
             while(IT.hasNext()) {
            	 System.out.println(IT.next());
             }
             
             


	}
}
