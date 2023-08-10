package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		
		HashMap HM1 = new HashMap<>();
		
		HM.put(101, "Rohit");
		HM.put(102, "Lina");
		HM.put(120, "Rahul");
		HM.put(107, "Piyush");
		HM.put(109, "Rohit");
		HM.put(100, "Gita");
		HM.put(105, "Sachin");
		
		System.out.println(HM);
		System.out.println(HM.get(102));
		
		System.out.println(HM.containsKey(120));  //TRUE
		System.out.println(HM.containsKey(103));  //False
		
		System.out.println(HM.containsValue("Rahul")); //true
		System.out.println(HM.containsValue("Hema")); //false
		
		System.out.println(HM.isEmpty());  //false
		System.out.println(HM1.isEmpty());  //True
		
		System.out.println(HM.keySet()); //100, 101, 102, 120, 105, 107, 109
		System.out.println(HM.values()); //Gita, Rohit, Lina, Rahul, Sachin, Piyush, Rohit
		
		for(Object obj : HM.keySet()) {
			System.out.println(obj);
		}
		
		System.out.println("********************");
		
		for(Object obj1 :HM.values()) {
			System.out.println(obj1);
		}
		
		System.out.println("****************");
		
		for(Object obj2 : HM.keySet()) {
			
			System.out.println(obj2+" "+HM.get(obj2));
		}
		System.out.println("*******************");
		
		//Enter Method
		
		for(Map.Entry entry:HM.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("********************");
		//Iterator
		
		Set S = HM.entrySet();
		
		Iterator it = S.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			}
		
		
		

	}

}
