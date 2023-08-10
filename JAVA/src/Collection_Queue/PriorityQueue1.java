package Collection_Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
 

public class PriorityQueue1 {

	public static void main(String[] args) {
		// Insertion order is not preserved in PQ
		// Dublicate element are allowed
		// homo type data
		
		//Insert/adding element
		//1. add method
		
		PriorityQueue PQ = new PriorityQueue();
		PriorityQueue PQ1 = new PriorityQueue();
		
		PQ.add('D');
		PQ.add('C');
		PQ.add('E');
		PQ.add('A');
		PQ.add('V');
		
		System.out.println(PQ);
		
	//	System.out.println(PQ.offer());
	//	PQ.offer("hh");                   //type filter text
		System.out.println(PQ.size());
		
		//offer method
	//	PQ.offer(null);      //NullPointerException
		System.out.println(PQ.offer('r'));  
		System.out.println(PQ);
		
		//3.Element
		
		//When the element is not present in the queue that time its shows NoSuchElementException
		System.out.println(PQ.element());
		
		//System.out.println(PQ1.element());  //NoSuchElementException
		
		//4.Peek
		//When the element is not present in the queue that time its shows null
		System.out.println(PQ.peek());
		System.out.println(PQ1.peek());    //NULL
		
		//5. Remove and Poll
		//When the element is not present in the queue and we are using remove method that time its shows NoSuchElementException
		
		System.out.println(PQ.remove());
		//System.out.println(PQ1.remove());  //NoSuchElementException
		
		//6. POLL
		//When the element is not present in the queue we are using remove that time its shows NULL
		System.out.println(PQ.poll());
		System.out.println(PQ1.poll());    //NULL
		
		System.out.println();
		
		//7. reading the element for using for each loop
		
		for(Object obj : PQ) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		Iterator IT = PQ.iterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
		
		System.out.println(PQ.isEmpty());
		System.err.println(PQ.contains('E'));
		
		
		
		
		
		

	}

}
